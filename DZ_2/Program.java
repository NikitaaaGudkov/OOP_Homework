package DZ_2;

public class Program {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.print();

        Rectangle newRectangle = (Rectangle)rectangle.getScaledRectangle(2);
        newRectangle.print();
    }
}
