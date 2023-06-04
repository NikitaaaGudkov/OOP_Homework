package DZ_2;

public class Rectangle implements IRectangle, IConst, IInfo, IPrint {
    private double width;
    private double height;

    public Rectangle() {
        this(10, 20);
    }

    public Rectangle(double width, double height) {
        if (width < MIN || height < MIN) {
            System.out.println(ERROR);
            width = MIN;
            height = MIN;
        }
        this.width = width;
        this.height = height;
        this.getInfo();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public IRectangle getScaledRectangle(double scale) {
        double newWidth = this.width * scale;
        double newHeight = this.height * scale;
        return new Rectangle(newWidth, newHeight);
    }

    @Override
    public void print() {
        System.out.printf("Прямоугольник с высотой %f и шириной %f имеет площадь %f и периметр %f\n",
                this.getHeight(), this.getWidth(), this.calculateArea(), this.calculatePerimeter());
    }
}
