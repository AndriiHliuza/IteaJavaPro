package com.itea.andrii.lecture10.hometask10.task1.version2;

import java.util.Arrays;

/*
Version 2 of Weekday
holiday - день тижня якому встановлюється певне свято за допомогою метода setHolidayName
 */
public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    private String holidayName;
    private boolean isHoliday;
    public void setHolidayName(String holidayName) {
        if ((holidayName != null) && !holidayName.isBlank()) {
            this.holidayName = holidayName;
            isHoliday = true;
        }
    }


    public String getHolidayName() {
        return holidayName;
    }

    public boolean isWeekDay() {
        return !isHoliday;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    public static boolean isWeekDayExists(String weekDay) {
        return Arrays.stream(values())
                .map(Enum::toString)
                .anyMatch(day -> day.equals(weekDay.toUpperCase()));
    }
}
