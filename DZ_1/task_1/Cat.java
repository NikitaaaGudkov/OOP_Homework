package DZ_1.task_1;
/*
Задача 1:
Создайте класс "Кот" (Cat) со следующими свойствами:

Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него. 
Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). 
Мой владелец - <имя владельца>.".
 */

public class Cat {
   private String name;
   private Integer age;
   private Owner owner;

   public Cat(String name, Integer age, Owner owner) {
      this.name = name;
      this.age = age;
      this.owner = owner;
   }

   public Owner getOwner() {
      return owner;
   }

   public void setOwner(Owner owner) {
      this.owner = owner;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getAge() {
      return age;
   }

   public void setAge(Integer age) {
      this.age = age;
   }

   public void greet() {
      System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.", name, age, owner.getName());
   }
}