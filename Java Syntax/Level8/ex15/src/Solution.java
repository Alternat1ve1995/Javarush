import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Surname1", new Date("AUGUST 1 1980"));
        map.put("Surname2", new Date("OCTOBER    1 1980"));
        map.put("Surname3", new Date("NOVEMBER 1 1980"));
        map.put("Surname4", new Date("DECEMBER 1 1980"));
        map.put("Surname5", new Date("MAY 1 1980"));
        map.put("Surname6", new Date("JULY 1 1980"));
        map.put("Surname7", new Date("FEBRUARY 1 1980"));
        map.put("Surname8", new Date("MARCH 1 1980"));
        map.put("Surname9", new Date("APRIL 1 1980"));

        return (map);
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        ArrayList<String>   list = new ArrayList<>();
        Iterator<Map.Entry<String, Date>>   iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)
                list.add(pair.getKey());
        }
        for (String key : list)
            map.remove(key);
        iterator = null;
    }

    public static void main(String[] args) {

    }
}
