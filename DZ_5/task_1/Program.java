/*
1 - Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), с возможностью выполнения 
базовых математических операций, таких как сложение, вычитание, умножение и деление, работающий с дробными числами.
Доп. Задача (*) Мы также обеспечим обработку возможных ошибок, чтобы предотвратить некорректные операции.
 */
public class Program {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(model, view);

        presenter.run();
    }
}
