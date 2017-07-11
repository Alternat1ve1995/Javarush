import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader		read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String>	list = new ArrayList<>();
		int					max = 0;
		int					min = 0;

		for (int i = 0; i < 10; i++)
			list.add(read.readLine());
		max = list.get(0).length();
		min = list.get(0).length();
		for (String s : list) {
			if (s.length() > max)
				max = s.length();
			else if (s.length() < min)
				min = s.length();
		}
		for (String s : list) {
			if (s.length() == min || s.length() == max) {
				System.out.println(s);
				break ;
			}
		}
	}
}