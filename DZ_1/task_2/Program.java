package DZ_1.task_2;

public class Program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
        System.out.printf("Прямоугольник с высотой %f и шириной %f имеет площадь %f и периметр %f", rectangle.getHeight(), rectangle.getWidth(), area, perimeter);
    }
}
