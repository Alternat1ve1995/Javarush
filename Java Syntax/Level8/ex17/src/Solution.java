import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer>    map = new HashMap<>();

        map.put("Surname1", 100);
        map.put("Surname2", 200);
        map.put("Surname3", 300);
        map.put("Surname4", 500);
        map.put("Surname5", 600);
        map.put("Surname6", 700);
        map.put("Surname7", 800);
        map.put("Surname8", 900);
        map.put("Surname9", 1000);
        map.put("Surname10", 1100);
        return (map);
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>>    iterator = map.entrySet().iterator();
        ArrayList<String>   list = new ArrayList<>();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer>  pair = iterator.next();
            if (pair.getValue() < 500)
                list.add(pair.getKey());
        }
        for (String s : list)
            map.remove(s);
    }

    public static void main(String[] args) {

    }
}