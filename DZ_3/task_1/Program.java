package DZ_3.task_1;

/*
 1)В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.
 */

import DZ_1.task_1.Cat;
import DZ_1.task_1.Owner;

public class Program {
    public static void main(String[] args) {
        Owner owner = new Owner("Никита");
        Cat cat = new Cat("Барсик", 2, owner);

        IInfo catInfo = (x) -> 
        {
            String result = "Имя: " + x.getName() + ", возраст: " + x.getAge() + ", хозяин: " + x.getOwner().getName();
            return result;
        };

        System.out.println(catInfo.getInfo(cat));
    }
}
