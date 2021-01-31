package homework1;

import java.util.Scanner;

public enum DayofWeek {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    public  void WorkHour(DayofWeek dayofWeek){
        switch (dayofWeek){
            case Monday:
                System.out.println("Осталось работать " + 40 + " часов");
                break;
            case Tuesday:
                System.out.println("Осталось работать " + 32 + " часа");
                break;
            case Wednesday:
                System.out.println("Осталось работать " + 24 + " часа");
                break;
            case Thursday:
                System.out.println("Осталось работать " + 16 + " часов");
                break;
            case Friday:
                System.out.println("Осталось работать " + 8 + " часов");
                break;
            case Saturday:
                System.out.println("Релакс!!");
                break;
            case Sunday:
                System.out.println("Последний день релакса ((");
                break;

        }

    }

}
