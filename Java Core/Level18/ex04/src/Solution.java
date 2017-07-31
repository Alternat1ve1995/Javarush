
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/*
Сортировка байт
*/

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader      reader = new BufferedReader(new InputStreamReader(System.in));
		String              filename = reader.readLine();
		FileInputStream     fread = new FileInputStream(filename);
		ArrayList<Integer>  list = new ArrayList<>();
		int                 len = 0;

		while (fread.available() > 0) {
			int     current = fread.read();

			if (!list.contains(current))
				list.add(current);
		}
		fread.close();
		list.sort(Comparator.naturalOrder());
		for (int n : list)
			System.out.print(n + " ");
	}
}
