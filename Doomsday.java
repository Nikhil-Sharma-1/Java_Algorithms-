/** This class contains a java implementation of the doomsday algorithm */

public class Doomsday {
    
    /** Tests the implementation */
    public static void test(){
        System.out.printf("Oct 13 1994 should be a Thursday: %s\n", getWeekDay(1994, 10, 13));
        System.out.printf("July 2 1364 should be a Monday: %s\n", getWeekDay(1364, 7, 2));
        System.out.printf("February 7 2020 should be a Friday: %s\n", getWeekDay(2020, 2, 7));

    }


    /** Gets the weekday of a specific date */
    public static String getWeekDay(int year, int month, int day){
        

        int[] months = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        year -= month < 3 ? 1 : 0;

        int weekday = (year + year / 4  - year / 100 + year / 400 + 
            months[month - 1] + day)  % 7;

        switch(weekday){
            case 0: 
                return "Sunday";
            case 1: 
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6: 
                return "Saturday";
        }

        return "Unknown";
    }

}
