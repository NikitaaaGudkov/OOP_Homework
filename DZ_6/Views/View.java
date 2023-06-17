package DZ_6.Views;
/*
Применение принципа разделения интерфейсов (Interface segregation principle).
Любое представление должно реализовывать указанные 4 метода, вне зависимости от того, 
будет ли у нас взаимодействие с пользователем через консоль или через окна. 
Любое представление должно уметь запрашивать у пользователя числа и операторы, а также выдавать результат или сообщения об ошибках. 
Никакой дополнительной функциональности представление не обязано реализовывать.

Также здесь применяется принцип подстановки Лисков (Liskov substitution principle).
В дальнейшем, если мы захотим перейти от консольного представления к оконному, нам достаточно у него реализовать интерфейс View. 
Вся логика приложения при этом нарушена не будет.
 */
public interface View {
    public double getNumber(String message);
    public String getOperator(String message);
    public void getResult(double firstNumber, String operator, double secondNumber, double result);
    public void printMessage(String message);
}
