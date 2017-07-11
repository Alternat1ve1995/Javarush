import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader		reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String>	list = new ArrayList<>();
		String				str = null;

		while (true) {
			str = reader.readLine();
			if (str.equals("end"))
				break ;
			list.add(str);
		}
		for (String s : list) {
			System.out.println(s);
		}

	}
}