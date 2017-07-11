import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader		read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String>	list = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			list.add(read.readLine());
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).length() < list.get(i - 1).length()) {
				System.out.println(i);
				break ;
			}
		}
	}
}
