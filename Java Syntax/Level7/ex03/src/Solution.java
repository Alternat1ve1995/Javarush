import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader		read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String>	list = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			list.add(0, read.readLine());
		for (String s : list)
			System.out.println(s);
	}
}