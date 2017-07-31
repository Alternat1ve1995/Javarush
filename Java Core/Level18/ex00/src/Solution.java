
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
Максимальный байт
*/

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		String          filename = reader.readLine();

		FileInputStream freader = new FileInputStream(filename);
		int             maxbyte = freader.read();

		while (freader.available() > 0) {
			int curr = freader.read();
			if (curr > maxbyte)
				maxbyte = curr;
		}
		freader.close();
		System.out.println(maxbyte);
	}
}
