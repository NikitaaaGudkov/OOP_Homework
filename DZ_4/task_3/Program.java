package DZ_4.task_3;
/*
Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает максимальное значение из них.
В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, ограниченных интерфейсом Comparable. 
Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.

В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double) и строку (String). 
В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.
Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, 
сохраняя при этом безопасность типов.
 */
public class Program {
    public static void main(String[] args) {
        Integer firstNumber = 5;
        Integer secondNumber = 10;

        Double firstNum = 9.8;
        Double secondNum = 9.6;

        String firstWord = "cba";
        String secondWord = "abc";

        System.out.println(getMax(firstNumber, secondNumber));
        System.out.println(getMax(firstNum, secondNum));
        System.out.println(getMax(firstWord, secondWord));
    }

    public static <T extends Comparable<T>> T getMax(T obj1, T obj2) {
        if(obj1.compareTo(obj2) >= 0) {
            return obj1;
        }
        else {
            return obj2;
        }
    }
}
