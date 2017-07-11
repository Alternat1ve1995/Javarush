import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader		reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer>	list = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			list.add(Integer.parseInt(reader.readLine()));
		for (int i = list.size() - 1; i > -1; i--)
			System.out.println(list.get(i));
	}
}