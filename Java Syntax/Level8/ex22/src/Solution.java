import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] list = s.split("\\b");
        s = "";
        for(int i = 0; i < list.length; i++){
            s += list[i].substring(0,1).toUpperCase() + list[i].substring(1);
        }
        System.out.println(s);
    }
}