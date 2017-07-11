import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) throws Exception {
		ArrayList<String>	list = new ArrayList<>();
		int					i = 0;

		list.add("мама");
		list.add("мыла");
		list.add("раму");
		while (i < list.size()) {
			list.add(i + 1, "именно");
			i += 2;
		}
		for (String s :list) {
			System.out.println(s);
		}
	}
}