import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws Exception {

        Calendar    calendar = new GregorianCalendar();
        DateFormat  dateFormat = new SimpleDateFormat("MMM dd yyyy", Locale.US);

        calendar.setTime(dateFormat.parse(date));
        int days = calendar.get(Calendar.DAY_OF_YEAR);
        if (days % 2 == 1)
            return (true);
        return (false);
    }
}
