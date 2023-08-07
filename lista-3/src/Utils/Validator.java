package Utils;

import java.util.HashMap;
import java.util.Map;

public class Validator {
    public static boolean dayOfBirthIsValid(int day, int month){
        Map<Integer, Integer> quantityOfDaysByMonth = new HashMap<Integer, Integer>();

        quantityOfDaysByMonth.put(1, 31);
        quantityOfDaysByMonth.put(2, 29);
        quantityOfDaysByMonth.put(3, 31);
        quantityOfDaysByMonth.put(4, 30);
        quantityOfDaysByMonth.put(5, 31);
        quantityOfDaysByMonth.put(6, 30);
        quantityOfDaysByMonth.put(7, 31);
        quantityOfDaysByMonth.put(8, 31);
        quantityOfDaysByMonth.put(9, 30);
        quantityOfDaysByMonth.put(10, 31);
        quantityOfDaysByMonth.put(11, 30);
        quantityOfDaysByMonth.put(12, 31);

        return day > quantityOfDaysByMonth.get(month) || day < 1;
    }

    public static boolean monthOfBirthIsValid(int month){
        return month < 1 || month > 12;
    }

    public static boolean isHourValid(int hours, int minutes, int seconds){
        if (hours < 0 || minutes < 0 || seconds <0){
            return false;
        }

        if(hours >= 24) return  false;
        if(minutes >= 60) return false;
        if(seconds >= 60) return false;

        return true;
    }
}
