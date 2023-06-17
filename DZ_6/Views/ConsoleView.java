package DZ_6.Views;

import java.util.Scanner;

public class ConsoleView implements View{
    Scanner scanner = new Scanner(System.in);

    @Override
    public double getNumber(String message) {
        System.out.println(message);
        double result = scanner.nextDouble();
        return result;
    }

    @Override
    public String getOperator(String message) {
        System.out.println(message);
        String result = scanner.next();
        return result;
    }

    @Override
    public void getResult(double firstNumber, String operator, double secondNumber, double result) {
        System.out.printf("%.1f %s %.1f = %.1f", firstNumber, operator, secondNumber, result);
    }

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
