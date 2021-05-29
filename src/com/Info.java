package com;
//to display informations about the current or a specific locale.
public class Info {
    private static String country;
    private static String language;
    private static String currency;
    private static String weekDays;
    private static String months;
    private static String today;

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Info.country = country;
    }

    public static String getLanguage() {
        return language;
    }

    public static void setLanguage(String language) {
        Info.language = language;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void setCurrency(String currency) {
        Info.currency = currency;
    }

    public static String getWeekDays() {
        return weekDays;
    }

    public static void setWeekDays(String weekDays) {
        Info.weekDays = weekDays;
    }

    public static String getMonths() {
        return months;
    }

    public static void setMonths(String months) {
        Info.months = months;
    }

    public static String getToday() {
        return today;
    }

    public static void setToday(String today) {
        Info.today = today;
    }
}

