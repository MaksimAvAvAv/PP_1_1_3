package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();


        userService.createUsersTable();


        userService.saveUser("Иван", "Иванов", (byte) 25);
        System.out.println("User с именем Иван добавлен в базу данных.");

        userService.saveUser("Петр", "Петров", (byte) 30);
        System.out.println("User с именем Петр добавлен в базу данных.");

        userService.saveUser("Светлана", "Сидорова", (byte) 28);
        System.out.println("User с именем Светлана добавлен в базу данных.");

        userService.saveUser("Анна", "Антонова", (byte) 22);
        System.out.println("User с именем Анна добавлен в базу данных.");


        System.out.println("Список всех пользователей:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }


        userService.cleanUsersTable();
        System.out.println("Таблица пользователей очищена.");


        userService.dropUsersTable();
        System.out.println("Таблица пользователей удалена.");
    }
}