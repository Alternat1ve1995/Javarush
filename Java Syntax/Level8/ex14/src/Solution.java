import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("1", "2");
        map.put("2", "4");
        map.put("3", "2");
        map.put("4", "2");
        map.put("5", "5");
        map.put("6", "8");
        map.put("7", "6");
        map.put("8", "6");
        map.put("9", "0");
        map.put("10", "2");
        return (map);
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int                                 count = 0;

        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(name))
                count++;
        }
        return (count);
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int                                 count = 0;

        while (iterator.hasNext()) {
            if (iterator.next().getKey().equals(lastName))
                count++;
        }
        return (count);
    }

    public static void main(String[] args) {

    }
}