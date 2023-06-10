package DZ_4.task_1;
/*
Задача 1 : Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.
В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T. 
Мы просто выводим этот элемент на консоль с помощью метода System.out.println().

В методе main мы вызываем printElement с различными типами данных: целое число (Integer), строку (String) и число с плавающей запятой (Double). 
Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
Таким образом, обобщенные методы позволяют нам писать код, который может работать с различными типами данных, 
обеспечивая простоту и гибкость использования.
 */
public class Program {
    public static void main(String[] args) {
        printElement(5);
        printElement("word");
        printElement(3.14);
    }

    public static <T> void printElement(T obj) {
        System.out.println(obj);
    }
}
