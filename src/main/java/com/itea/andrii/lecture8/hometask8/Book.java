package com.itea.andrii.lecture8.hometask8;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private double price;

    public Book(String name, String author, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 10) {
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }
}
