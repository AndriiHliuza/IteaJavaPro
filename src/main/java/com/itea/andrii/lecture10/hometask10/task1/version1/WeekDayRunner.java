package com.itea.andrii.lecture10.hometask10.task1.version1;

public class WeekDayRunner {
    public static void main(String[] args) {
        for (WeekDay weekDay : WeekDay.values()) {
            System.out.println(weekDay + " -> Будній день: " + weekDay.isWeekDay() + " Вихідний день: " + weekDay.isHoliday());
        }
        String weekday1 = "Monday";
        String weekday2 = "ggg";
        System.out.println(weekday1 + " is exists: " + WeekDay.isWeekDayExists(weekday1));
        System.out.println(weekday2 + " is exists: " + WeekDay.isWeekDayExists(weekday2));
    }
}
