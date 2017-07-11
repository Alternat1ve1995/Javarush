

/*
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		int     i = 0;
		int     j = 0;

		while (i < 10) {
			while (++j < 11)
				System.out.print("S");
			System.out.println();
			j = 0;
			i++;
		}

	}
}
