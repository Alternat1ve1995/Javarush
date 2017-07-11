import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) throws Exception {
		ArrayList<String>	list = new ArrayList<>();
		BufferedReader		read = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++)
			list.add(read.readLine());
		for (int i = 0; i < 13; i++) {
			list.add(0, list.get(list.size() - 1));
			list.remove(list.size() - 1);
		}
		for (String s : list) {
			System.out.println(s);
		}
	}
}