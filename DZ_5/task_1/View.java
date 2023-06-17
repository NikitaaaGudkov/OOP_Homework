import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public double getNumber(String message) {
        System.out.println(message);
        double result = scanner.nextDouble();
        return result;
    }

    public String getOperator(String message) {
        System.out.println(message);
        String result = scanner.next();
        return result;
    }

    public void getResult(double firstNumber, String operator, double secondNumber, double result) {
        System.out.printf("%.1f %s %.1f = %.1f", firstNumber, operator, secondNumber, result);
    }

    public void printError(String message) {
        System.out.println(message);
    }
}
