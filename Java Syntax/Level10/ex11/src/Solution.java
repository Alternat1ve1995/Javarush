
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Количество букв
*/

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// алфавит
		String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
		char[] abcArray = abc.toCharArray();

		ArrayList<Character> alphabet = new ArrayList<Character>();
		for (int i = 0; i < abcArray.length; i++) {
			alphabet.add(abcArray[i]);
		}

		// ввод строк
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			String s = reader.readLine();
			list.add(s.toLowerCase());
		}

		int[] intArray = new int[abcArray.length];

		for (String s : list)
			for (int i = 0; i < s.length(); i++)
				for (int j = 0; j < abcArray.length; j++)
					if (abcArray[j] == s.charAt(i)) {
						intArray[j]++;
						break;
					}
		for (int i = 0; i < abcArray.length; i++)
			System.out.println(abcArray[i] + " " + intArray[i]);
	}
}
