package com.itea.andrii.lecture5.hometask5;

public class Student extends Person {
    private int id;
    private String department;
    private double rating;
    private int admissionYear;
    public Student(String name, String surname, int age, int id, String department, double rating, int admissionYear) {
        super(name, surname, age);
        this.id = id;
        this.department = department;
        setRating(rating);
        setAdmissionYear(admissionYear);
    }

    @Override
    public void printPersonInformation() {
        super.printPersonInformation();
        System.out.println("Id: " + id + "\n" +
                "Факультет: " + department + "\n" +
                "Рейтинг: " + rating + "\n" +
                "Рік вступу: " + admissionYear);
    }

    @Override
    public String toString() {
        return "Студент " + super.toString() + ", рейтинг - " + rating;
    }

    public void setRating(double rating) {
        if (rating > 0 && rating <= 100) {
            this.rating = rating;
        } else {
            throw new RuntimeException("Invalid rating");
        }
    }

    public void setAdmissionYear(int admissionYear) {
        // (19\d{2})|(20[0-1]\d)|(202[0-3]) Перевірка на рік в межах 1900 - 2023
        if (Integer.toString(admissionYear).matches("(19\\d{2})|(20[0-1]\\d)|(202[0-3])")) {
            this.admissionYear = admissionYear;
        } else {
            throw new RuntimeException("Invalid year");
        }
    }

    public double getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }
}
