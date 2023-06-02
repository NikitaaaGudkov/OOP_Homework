package DZ_1.task_1;

public class Program {
    public static void main(String[] args) {
        Owner tom = new Owner("Том");
        Cat barsik = new Cat("Барсик", 2, tom);
        barsik.greet();
    }
}