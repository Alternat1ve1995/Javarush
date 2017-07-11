
/*
Задача №3 на преобразование целых типов
*/

public class Solution {
	public static void main(String[] args) {
		float f = (float) 128.50;
		int i = (int) f;
		int b = (byte) (i + f);
		System.out.println(b);
	}
}
