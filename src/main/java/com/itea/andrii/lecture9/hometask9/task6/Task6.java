package com.itea.andrii.lecture9.hometask9.task6;

public class Task6 {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        System.out.println("The book was added to catalog: " + catalog.addBookToCatalog("Angels and Demons", "Dan Brown"));
        System.out.println("The book was added to catalog: " + catalog.addBookToCatalog("Angels and Demons", "Dan Brown"));
        System.out.println("The book was added to catalog: " + catalog.addBookToCatalog("The Hunger Games", "Suzan Collins"));
        System.out.println("The book was added to catalog: " + catalog.addBookToCatalog("Rich Dad - Poor Dad", "Robert Kiyosaki"));
        System.out.println("The book was added to catalog: " + catalog.addBookToCatalog("The Da Vinci Code", "Dan Brown"));

        System.out.println("--------------------");
        System.out.println(catalog.giveBook("Angels and Demons", "Dan Brown", "John", "Biden"));
        System.out.println(catalog.giveBook("Angels and Demons", "Dan Brown", "Bob", "Jackson"));
        catalog.showAllBooksInfo();

        System.out.println("--------------------");
        System.out.println(catalog.removeBookFromCatalog("Angels and Demons", "Dan Brown"));
        catalog.showAllBooksInfo();

        System.out.println("--------------------");
        System.out.println(catalog.getBookBack("Angels and Demons", "Dan Brown", "John", "Biden"));
        catalog.showAllBooksInfo();
        System.out.println(catalog.removeBookFromCatalog("Angels and Demons", "Dan Brown"));
        catalog.showAllBooksInfo();

    }
}
