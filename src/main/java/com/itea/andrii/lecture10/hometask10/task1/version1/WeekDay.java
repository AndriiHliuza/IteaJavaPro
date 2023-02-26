package com.itea.andrii.lecture10.hometask10.task1.version1;

import java.util.Arrays;

/*
Version 1 of Weekday
holiday - вихідний день (субота, неділя)
 */
public enum WeekDay {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY,
    SUNDAY;
    private boolean isWeekDay;

    WeekDay() {
    }

    WeekDay(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }

    public boolean isHoliday() {
        return !isWeekDay;
    }

    public static boolean isWeekDayExists(String weekDay) {
        return Arrays.stream(values())
                .map(Enum::toString)
                .anyMatch(day -> day.equals(weekDay.toUpperCase()));
    }
}
