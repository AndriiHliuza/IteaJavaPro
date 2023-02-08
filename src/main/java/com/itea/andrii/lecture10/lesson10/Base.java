package com.itea.andrii.lecture10.lesson10;

@BaseAction(level = 2, sqlRequest = "SELECT * FROM phonebook")
public class Base {
    public void doAction() {
        Class<Base> f = Base.class;
        BaseAction a = f.getAnnotation(BaseAction.class);
        System.out.println(a.level());
        System.out.println(a.sqlRequest());
    }

    public static void main(String[] args) {
        Base base = new Base();
        base.doAction();
    }
}
