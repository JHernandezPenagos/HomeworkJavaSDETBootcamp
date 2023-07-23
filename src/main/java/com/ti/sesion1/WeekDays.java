package com.ti.sesion1;

public enum WeekDays {
    MONDAY(2, "Work"),
    TUESDAY(4, "Go to park"),
    WEDNESDAY(7, "Play Piano"),
    THURSDAY(8, "Dance"),
    FRIDAY(10, "Party"),
    SATURDAY(10, "Crazy Party"),
    SUNDAY(1, "Rest");

    final int ranking;
    final String event;

    WeekDays(int ranking, String event) {
        this.ranking = ranking;
        this.event = event;
    }
}
