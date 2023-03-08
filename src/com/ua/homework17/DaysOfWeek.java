package com.ua.homework17;

public enum DaysOfWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
    private int numberDay;

    private DaysOfWeek(int numberDay) {
        this.numberDay = numberDay;
    }

    public static void getNameOfDay(int numberDay) {

        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            if (daysOfWeek.numberDay == numberDay) {
                System.out.println(daysOfWeek.name());
            }
        }
    }
}