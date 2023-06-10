package DZ_3.task_3;

/*
3)(Опционально, по желанию) Задача: Написать функцию, которая принимает список объектов и компаратор 
для сортировки объектов по заданному критерию. Функция должна возвращать отсортированный список объектов.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Human> people = new ArrayList<>();
        people.add(0, new Human("Никита", 24) );
        people.add(0, new Human("Александр", 30) );
        people.add(0, new Human("Иван", 15) );
        people.add(0, new Human("Алексей", 20) );
        people.add(0, new Human("Дмитрий", 10) );

        var ageSortedPeople = MySorting(people, new AgeComparator());

        for (Human human : ageSortedPeople) {
            System.out.println(human);
        }

        System.out.println();

        var nameSortedPeople = MySorting(people, new NameComparator());
        for (Human human : nameSortedPeople) {
            System.out.println(human);
        }
    }

    public static List<Human> MySorting(List<Human> myList, Comparator<Human> myComp) {
        var result = new ArrayList<Human>();
        for (Human human : myList) {
            result.add(0, human);
        }
        Collections.sort(result, myComp);
        return result;
    }
}
