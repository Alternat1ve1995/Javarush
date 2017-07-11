import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) throws Exception {
		ArrayList<String>	list = new ArrayList<>();
		BufferedReader		read = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++)
			list.add(read.readLine());
		list.remove(2);
		for (int i = list.size() - 1; i > -1; i--)
			System.out.println(list.get(i));
	}
}