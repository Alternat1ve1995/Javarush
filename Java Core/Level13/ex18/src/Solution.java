
import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String  filename = reader.readLine();

		while (true) {
			String  s = reader.readLine();
			writer.write(s.toCharArray());
			writer.write(new char[]{'\n'});
			if (s.equals("exit"))
				break;
		}
		reader.close();
		writer.close();
	}
}
