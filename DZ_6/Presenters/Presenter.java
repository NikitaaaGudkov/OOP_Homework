package DZ_6.Presenters;

import java.util.InputMismatchException;

import DZ_6.Models.Model;
import DZ_6.Views.View;

public class Presenter {
    Model model;
    View view;

    /*
    Применение принципа инверсии зависимостей (Dependency inversion principle).
    В конструкторе презентора мы передаём какие-то абстрактные модель и представление, 
    в результате презентор не будет зависеть от их деталей реализации и мы во внешнем коде сможем 
    в качестве параметров презентора передавать любую модель и любое представление.
     */
    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        double firstNumber;
        double secondNumber;
        String result = "";
        try{
            firstNumber = view.getNumber("Введите первое число: ");
            model.setFirstNumber(firstNumber);
        }
        catch(InputMismatchException error) {
            result = "Вы ввели не число!";
            view.printMessage(result);
            return;
        } 
        String operation = view.getOperator("Введите операцию (+, -, *, /): ");
        if(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            model.setOperation(operation);
        }
        else {
            result = "Нераспознанная операция, проверьте ввод!";
            view.printMessage(result);
            return;
        }
        try {
            secondNumber = view.getNumber("Введите второе число: ");
            model.setSecondNumber(secondNumber);
        }
        catch(InputMismatchException error) {
            result = "Вы ввели не число!";
            view.printMessage(result);
            return;
        }    
        result = model.getResult();
        double res;
        try {
            res = Double.parseDouble(result);
        }
        catch(NumberFormatException error) {
            view.printMessage(result);
            return;
        }
        view.getResult(firstNumber, operation, secondNumber, res);
    }
}
