package DZ_5.task_2;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> userList;

    public UserList() {
        userList = new ArrayList<User>();
    }

    public String save(User user) {
        for (User item : userList) {
            if(item.getLogin().equals(user.getLogin())) {
                return "Пользователь с таким логином уже существует!";
            }
        }
        userList.add(user);
        return "Пользователь успешно добавлен";
    }

    public User load(String login, String password) {
        for (User item : userList) {
            if(item.getLogin().equals(login) && item.getPassword().equals(password)) {
                return item;
            }
        }
        return null;
    }
}
