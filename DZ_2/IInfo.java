package DZ_2;

public interface IInfo {
    default void getInfo() {
        System.out.println("Данная фигура реализует интерфейс IInfo");
    }
}
