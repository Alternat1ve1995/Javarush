import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Surname1", "Vasia");
        map.put("Surname2", "Petia");
        map.put("Surname3", "Biba");
        map.put("Surname4", "Boba");
        map.put("Surname5", "Vasia");
        map.put("Surname6", "Kaka");
        map.put("Surname7", "Petia");
        map.put("Surname8", "Dima");
        map.put("Surname9", "Vika");
        map.put("Surname10", "Petia");
        return (map);
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String>   list = new ArrayList<>();
        ArrayList<String>   copies = new ArrayList<>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int                 flag = 1;

        while (iterator.hasNext()) {
            Map.Entry<String, String>   pair = iterator.next();
            list.add(pair.getValue());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                String  s = list.get(j);
                if (s.equals(list.get(i)) && j != i) {
                    for (String str : copies) {
                        if (str.equals(s))
                            flag = 0;
                    }
                    if (flag == 1)
                        copies.add(s);
                    flag = 1;
                }
            }
        }
        for (String s : copies) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
