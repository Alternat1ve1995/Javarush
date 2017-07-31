
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
Самые частые байты
*/

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader              reader = new BufferedReader(new InputStreamReader(System.in));
		int[]                       arr = new int[256];
		int                         max = 0;
		String                      filename = reader.readLine();
		FileInputStream             finput = new FileInputStream(filename);

		while (finput.available() > 0) {
			int currByte = finput.read();
			arr[currByte]++;
		}
		finput.close();
		for (int value : arr) {
			if (value > max)
				max = value;
		}
		for (int i = 0; i < arr.length; i ++)
			if (arr[i] == max)
				System.out.print(i + " ");
	}
}
