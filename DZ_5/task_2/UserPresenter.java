package DZ_5.task_2;

public class UserPresenter {
    User user;
    UserList userList;
    UserView view;

    public UserPresenter(UserList userList, UserView view) {
        this.userList = userList;
        this.view = view;
    }

    public void run() {
        boolean isOpen = true;
        while(isOpen) {
            view.printMessage(String.format("Привет, %s", view.getUserName()));
            int action = view.getMenu();
            switch(action) {
                case 1: {
                    String name = view.getUserInfo("Введите ваше имя:");
                    String login = view.getUserInfo("Придумайте ваш логин:");
                    String password = view.getUserInfo("Придумайте ваш пароль:");
                    User newUser = new User(name, login, password);
                    view.printMessage(userList.save(newUser));
                    break;
                }
                case 2: {
                    String login = view.getUserInfo("Введите ваш логин:");
                    String password = view.getUserInfo("Введите ваш пароль:");
                    User user = userList.load(login, password);
                    this.user = user;
                    if(user != null) {
                        view.setUserName(user.getName());
                    }
                    else {
                        view.printMessage("Пользователь не найден. Проверьте логин и пароль.");
                    }
                    break;
                }
                case 3: {
                    if(view.getUserName().equals("гость")) {
                        view.printMessage("Войдите под своей учётной записью");
                    }
                    else {
                        String password = view.getUserInfo("Введите новый пароль:");
                        user.setPassword(password);
                        view.printMessage("Пароль успешно изменён!");
                    }
                    break;
                }
                case 4:
                default: {
                    isOpen = false;
                    break;
                }
            }
        }
    }
}
