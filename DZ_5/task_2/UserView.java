package DZ_5.task_2;

import java.util.Scanner;

public class UserView {
    private String userName;
    
    public UserView() {
        userName = "гость";
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    Scanner scanner = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }

    public Integer getMenu() {
        System.out.println("Выберите цифру дальнейшего действия:\n1 - Регистрация\n2 - Вход\n3 - Изменение пароля\n4 - Выход из приложения");
        Integer result = scanner.nextInt();
        return result;
    }

    public String getUserInfo(String message) {
        System.out.println(message);
        String result = scanner.next();
        return result;
    }
}
