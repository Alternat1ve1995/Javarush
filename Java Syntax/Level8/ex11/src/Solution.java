import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader      read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>  list = new ArrayList<>();
        int                 curr_len = 1;
        int                 max_len = 0;

        for (int i = 0; i < 10; i++)
            list.add(Integer.parseInt(read.readLine()));
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                curr_len++;
            }
            else
                curr_len = 1;
            if (curr_len > max_len)
                max_len = curr_len;
        }
        System.out.println(max_len);
    }
}