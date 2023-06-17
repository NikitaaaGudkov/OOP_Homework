import java.util.InputMismatchException;

public class Presenter {
    Model model;
    View view;

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
            view.printError(result);
            return;
        } 
        String operation = view.getOperator("Введите операцию (+, -, *, /): ");
        if(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            model.setOperation(operation);
        }
        else {
            result = "Нераспознанная операция, проверьте ввод!";
            view.printError(result);
            return;
        }
        try {
            secondNumber = view.getNumber("Введите второе число: ");
            model.setSecondNumber(secondNumber);
        }
        catch(InputMismatchException error) {
            result = "Вы ввели не число!";
            view.printError(result);
            return;
        }    
        result = model.getResult();
        double res;
        try {
            res = Double.parseDouble(result);
        }
        catch(NumberFormatException error) {
            view.printError(result);
            return;
        }
        view.getResult(firstNumber, operation, secondNumber, res);
    }
}
