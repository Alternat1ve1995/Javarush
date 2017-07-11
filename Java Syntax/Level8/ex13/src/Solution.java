import java.util.HashSet;
import java.util.Iterator;
import java.*;
import java.util.Map;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
       HashSet<Integer> set = new HashSet<>();

       for (int i = 1; i < 21; i++)
           set.add(i);
       return (set);
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet copy = new HashSet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            int a = (int)it.next();
            if(a <= 10)
                copy.add(a);

        }
        return copy;
    }

    public static void main(String[] args) {

    }
}