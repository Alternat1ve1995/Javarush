import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        int     min = array.get(0);

        for (int temp : array) {
            if (temp < min)
                min = temp;
        }
        return (min);
    }

    public static List<Integer> getIntegerList() throws IOException {

        ArrayList<Integer>  list = new ArrayList<>();
        BufferedReader      read = new BufferedReader(new InputStreamReader(System.in));
        int                 numbers = Integer.parseInt(read.readLine());

        while (numbers > 0) {
            list.add(Integer.parseInt(read.readLine()));
            numbers--;
        }
        return (list);
    }
}