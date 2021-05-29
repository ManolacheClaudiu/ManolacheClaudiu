package com;

import java.util.*;

public class SetLocale {
    private static Locale usLocale = Locale.US;
    private static Locale roLocale = new Locale("ro", "RO");

    public static Locale getUsLocale() {
        return usLocale;
    }

    public static void setUsLocale(Locale usLocale) {
        SetLocale.usLocale = usLocale;
    }

    public static Locale getRoLocale() {
        return roLocale;
    }

    public static void setRoLocale(Locale roLocale) {
        SetLocale.roLocale = roLocale;
    }


}
