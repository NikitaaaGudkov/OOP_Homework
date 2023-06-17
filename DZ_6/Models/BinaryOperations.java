package DZ_6.Models;
/*
Применение принципа единственной ответственности (Single responsibility principle).
Инкапуслируем в отдельный класс все математические операции в одном классе, для удобства тестирования и 
для уменьшения зоны ответственности основного класса модели.
 */
public class BinaryOperations {
    private double firstNumber;
    private double secondNumber;
    private String operation;
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    public String getResult() {
        String result = "";
        switch (operation) {
            case "+":
                result = sum();
                break;
            case "-":
                result = subtraction();
                break;
            case "*":
                result = multiplication();
                break;
            case "/":
                result = division();
                break;    
            default:
                break;
        }
        return result;
    }

    private String sum() {
        double result = firstNumber + secondNumber;
        return String.valueOf(result);
    }

    private String subtraction() {
        double result = firstNumber - secondNumber;
        return String.valueOf(result);
    }

    private String multiplication() {
        double result = firstNumber * secondNumber;
        return String.valueOf(result);
    }

    private String division() {
        if(secondNumber == 0) {
            return "Ошибка! Попытка деления на ноль!";
        }
        double result = firstNumber / secondNumber;
        return String.valueOf(result);
    }
}
