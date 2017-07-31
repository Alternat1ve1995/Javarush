
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Самые редкие байты
*/

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[]                       arr = new int[256];
		int                         min = 300;
		String                      filename = reader.readLine();
		FileInputStream             finput = new FileInputStream(filename);

		while (finput.available() > 0) {
			int currByte = finput.read();
			arr[currByte]++;
		}
		finput.close();
		for (int value : arr) {
			if (value < min && value > 0)
				min = value;
		}
		for (int i = 0; i < arr.length; i ++)
			if (arr[i] == min)
				System.out.print(i + " ");
	}
}