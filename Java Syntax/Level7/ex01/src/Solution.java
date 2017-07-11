import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader		read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String>	list = new ArrayList<>();
		int					len = 0;

		for (int i = 0; i < 5; i++)
			list.add(read.readLine());
		for (String s : list)
			if (s.length() > len)
				len = s.length();
		for (String s : list) {
			if (s.length() == len)
				System.out.println(s);
		}
	}
}