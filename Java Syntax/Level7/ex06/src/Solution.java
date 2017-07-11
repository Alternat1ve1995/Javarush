import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader		read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer>	main_list = new ArrayList<>();
		ArrayList<Integer>	three_list = new ArrayList<>();
		ArrayList<Integer>	two_list = new ArrayList<>();
		ArrayList<Integer>	other_list = new ArrayList<>();

		for (int i = 0; i < 20; i++)
			main_list.add(Integer.parseInt(read.readLine()));
		for (Integer n : main_list) {
			if (n % 3 == 0)
				three_list.add(n);
			if (n % 2 == 0)
				two_list.add(n);
			if (n % 2 != 0 && n % 3 != 0)
				other_list.add(n);
		}
		printList(three_list);
		printList(two_list);
		printList(other_list);
	}

	public static void printList(List<Integer> list) {
		for (Integer n : list) {
			System.out.println(n);
		}
	}
}