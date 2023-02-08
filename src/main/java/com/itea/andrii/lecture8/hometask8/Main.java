package com.itea.andrii.lecture8.hometask8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Task #1
        Book book = new Book("Angels and Demons", "Den Brown", "USA", 200);
        book.printInfo();

        // Task #2
        User user1 = new User("John", "123456");
        User user2 = new User("Bob", "123456");
        User user3 = new User("John", "123456");

        user2.deleteFromUserList();

        user1.login();
        user2.login();
        user3.login();

        System.out.println("\n----------------\n");

        user1.login(user2);
        user1.login(user3);

        System.out.println("\n----------------\n");

        User.login(user1, user2);
        User.login(user1, user3);

        System.out.println("\n----------------\n");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        user1.login(users);
        user2.login(users);
        user3.login(users);

        System.out.println("\n----------------\n");
        users.remove(user2);

        user1.login(users);
        user2.login(users);
        user3.login(users);
    }
}
