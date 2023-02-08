package com.itea.andrii.lecture10.hometask10.task1.version2;

public class WeekDayRunner {
    public static void main(String[] args) {
        WeekDay tuesday = WeekDay.TUESDAY;
        tuesday.setHolidayName("New Year");
        for (WeekDay weekDay : WeekDay.values()) {
            System.out.println(weekDay + " -> Звичайний день: " + weekDay.isWeekDay() + " Святковий день: " + weekDay.isHoliday());
        }
        String weekday1 = "Monday";
        String weekday2 = "ggg";
        System.out.println(weekday1 + " is exists: " + com.itea.andrii.lecture10.hometask10.task1.version1.WeekDay.isWeekDayExists(weekday1));
        System.out.println(weekday2 + " is exists: " + com.itea.andrii.lecture10.hometask10.task1.version1.WeekDay.isWeekDayExists(weekday2));
    }
}
