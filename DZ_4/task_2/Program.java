package DZ_4.task_2;
/*
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T.
Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.

В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. 
В результате мы получаем вывод на консоль элементов каждого массива.
Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных, 
обеспечивая повторное использование и гибкость.
 */
public class Program {
    public static void main(String[] args) {
        Integer[] arrayNum = new Integer[] { 1, 2, 3, 4, 5};
        String[] arrayWord = new String[] {"a", "b", "c", "d", "e"};

        printArray(arrayNum);
        System.out.println();
        printArray(arrayWord);
    }

    public static <T> void printArray(T[] myArray) {
        for (T item : myArray) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }
}
