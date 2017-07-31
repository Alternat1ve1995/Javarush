
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String          filename = reader.readLine();

		FileInputStream freader = new FileInputStream(filename);
		int             minbyte = freader.read();

		while (freader.available() > 0) {
			int curr = freader.read();
			if (curr < minbyte)
				minbyte = curr;
		}
		freader.close();
		System.out.println(minbyte);
	}
}