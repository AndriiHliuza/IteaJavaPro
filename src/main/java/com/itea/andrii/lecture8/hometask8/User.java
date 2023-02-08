package com.itea.andrii.lecture8.hometask8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private String password;

    private static final ArrayList<User> users = new ArrayList<>();

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        users.add(this);
    }


    public void addToUserList() {
        users.add(this);
    }
    public void deleteFromUserList() {
        users.remove(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public void login() {
        if (users.contains(this)) {
            System.out.println("Ім'я користувача та пароль збігаються");
        } else {
            System.out.println("Ім'я користувача або пароль не збігаються");
        }
    }

    public void login(User user) {
        if (equals(user)) {
            System.out.println("Ім'я користувача та пароль збігаються");
        } else {
            System.out.println("Ім'я користувача та пароль не збігаються");
        }
    }

    public static void login(User user1, User user2) {
        if (user1.equals(user2)) {
            System.out.println("Ім'я користувача та пароль збігаються");
        } else {
            System.out.println("Ім'я користувача або пароль не збігаються");
        }
    }

    public void login(List<User> users) {
        if (users.contains(this)) {
            System.out.println("Ім'я користувача та пароль збігаються");
        } else {
            System.out.println("Ім'я користувача або пароль не збігаються");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
