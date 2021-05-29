package com;

public class DisplayLocales {
    public void display(Info info,int lang){
        if(lang==1)
        {
            System.out.println("Country: "+ info.getCountry());
            System.out.println("Language: " + info.getLanguage());
            System.out.println("Currency: " + info.getCurrency());
            System.out.println("Week Days: " + info.getWeekDays());
            System.out.println("Months: " + info.getMonths());
            System.out.println("Today: " + info.getToday());
        }
        else{
            if(lang==2){
                    System.out.println("Tara: " + info.getCountry());
                    System.out.println("Limba: " + info.getLanguage());
                    System.out.println("Moneda: " + info.getCurrency());
                    System.out.println("Zilele saptamanii: " + info.getWeekDays());
                    System.out.println("Lunile anului: " + info.getMonths());
                    System.out.println("Data de azi: " + info.getToday());

            }
            else{
                System.out.println("invalid");
        }

    }
}
}
