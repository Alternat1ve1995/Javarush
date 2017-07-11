
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
	public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

	public static void main(String[] args) throws Exception {
		String  vow = "";
		String  nvow = "";
		char[]  str;
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		String  get = reader.readLine();

		str = get.toCharArray();

		for (char c : str) {
			if (isVowel(c))
				vow = vow + c + " ";
			else
				if (c != ' ')
					nvow = nvow + c + " ";
		}
		System.out.println(vow + "\n" + nvow);
	}

	// метод проверяет, гласная ли буква
	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

		for (char d : vowels)   // ищем среди массива гласных
		{
			if (c == d)
				return true;
		}
		return false;
	}
}