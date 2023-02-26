package com.itea.andrii.lecture9.hometask9.task6;

import java.util.*;

public class Catalog {

    private final List<Book> allBooksInCatalog = new ArrayList<>();

    private class Reader {
        private final String name;
        private final String surname;

        public Reader(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Reader reader = (Reader) o;
            return Objects.equals(name, reader.name) && Objects.equals(surname, reader.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname);
        }

        @Override
        public String toString() {
            return "Reader{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }

    private class Book {
        private final String name;
        private final String author;
        private boolean isAvailable = true;
        private final Deque<Reader> readers = new ArrayDeque<>();
        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(name, book.name) && Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, author);
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", isAvailable=" + isAvailable +
                    ", readers=" + readers +
                    '}';
        }
    }

    public boolean addBookToCatalog(String bookName, String bookAuthor) {
        Book book = new Book(bookName, bookAuthor);
        return !allBooksInCatalog.contains(book) && allBooksInCatalog.add(book);
    }

    public boolean removeBookFromCatalog(String bookName, String bookAuthor) {
        Book book = new Book(bookName, bookAuthor);
        if (allBooksInCatalog.contains(book) && allBooksInCatalog.get(allBooksInCatalog.indexOf(book)).isAvailable) {
            return allBooksInCatalog.remove(book);
        }
        return false;
    }

    public boolean giveBook(String bookName, String bookAuthor, String readerName, String readerSurname) {
        Book book = new Book(bookName, bookAuthor);
        if (allBooksInCatalog.contains(book) && allBooksInCatalog.get(allBooksInCatalog.indexOf(book)).isAvailable) {
            Book bookFromCatalog = allBooksInCatalog.get(allBooksInCatalog.indexOf(book));
            bookFromCatalog.isAvailable = false;
            bookFromCatalog.readers.add(new Reader(readerName, readerSurname));
            return true;
        }
        return false;
    }

    public boolean getBookBack(String bookName, String bookAuthor, String readerName, String readerSurname) {
        Book book = new Book(bookName, bookAuthor);
        Reader reader = new Reader(readerName, readerSurname);
        if (allBooksInCatalog.contains(book)
                && !allBooksInCatalog.get(allBooksInCatalog.indexOf(book)).isAvailable
                && Objects.equals(allBooksInCatalog.get(allBooksInCatalog.indexOf(book))
                .readers
                .peekLast(), reader)) {
            allBooksInCatalog.get(allBooksInCatalog.indexOf(book)).isAvailable = true;
            return true;
        }
        return false;
    }

    public void showAllBooksInfo() {
        allBooksInCatalog.forEach(System.out::println);
    }


}
