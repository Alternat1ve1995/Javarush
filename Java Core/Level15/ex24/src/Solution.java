
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Файл в статическом блоке
*/

public class Solution {

	public static List<String> lines = new ArrayList<String>();

	static {

		try
		{
			File    file = new File(Statics.FILE_NAME);

			BufferedReader  freader = new BufferedReader(new FileReader(file.getAbsoluteFile()));
			String          line = null;

			while ((line = freader.readLine()) != null){
				lines.add(line);
			}
		}
		catch (Exception e) {}
	}

	public static void main(String[] args) {
		System.out.println(lines);
	}
}
