package app;

import com.DisplayLocales;
import com.Info;
import com.SetLocale;


import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleExplore {
    public static void main(String[] args){


        System.out.println("Type 1 for English or 2 for Romanian:(Scrie 1 pentru engleza sau 2 pentru romana)");
        Scanner sc = new Scanner(System.in);
        int lang = sc.nextInt();
        SetLocale setLocale = new SetLocale();
        ResourceBundle r;
        if(lang==1) {
             r = ResourceBundle.getBundle("res/Messages", setLocale.getUsLocale());
        }
        else{
           r = ResourceBundle.getBundle("res/Messages",setLocale.getRoLocale());
        }

        Info info = new Info();
        info.setCountry(r.getString("country"));
        info.setLanguage(r.getString("language"));
        info.setCurrency(r.getString("currency"));
        info.setWeekDays(r.getString("weekDays"));
        info.setMonths(r.getString("months"));
        info.setToday(r.getString("today"));



        DisplayLocales displayLocales = new DisplayLocales();
        displayLocales.display(info,lang);

    }
}
