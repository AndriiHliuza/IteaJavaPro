package com.itea.andrii.lecture10.lesson10.example.logic;

import com.itea.andrii.lecture10.lesson10.example.annotation.SecurityLevelEnum;

import java.lang.reflect.Method;

public class SecurityLogic {
    public void onInvoke(SecurityLevelEnum level, Method method, Object[] args) {
        StringBuilder argsString = new StringBuilder();
        for (Object arg : args) {
            argsString.append(arg.toString()).append(" :");
        }
        argsString.setLength(argsString.length() - 1);
        System.out.printf("Method %s was invoked with parameters : %s%n", method.getName(), argsString);

        switch (level) {
            case LOW -> System.out.println("Низький рівень перевірки безпеки: " + level);
            case NORMAL -> System.out.println("Звичайний рівень перевірки безпеки: " + level);
            case HIGH -> System.out.println("Високий рівень перевірки безпеки: " + level);
        }
    }
}
