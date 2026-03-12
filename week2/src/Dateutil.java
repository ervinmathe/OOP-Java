package week2;

public class Dateutil {

    public static boolean leapYear(int year) {
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            return true ;
        } else {
            return false ;
        }
    }   
    public static boolean isValidDate(int year , int month , int day) {

        if(year > 0 && (0 < month && month <= 12) && (day > 0 && day < 32)) {       
            if(month == 2 && day > 28 && !leapYear(year)) {
                return false ;
            } else if(month == 2 && day > 29 && leapYear(year)) {
                return false ;
            } else if((month == 4 || month == 6 || month == 9 || month == 11)  && day > 30) {
                return false ;
            } else {
                return true ;
            }
            
        }
        return false;
    }
}