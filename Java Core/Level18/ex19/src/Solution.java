
/*
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader		reader = new BufferedReader(new InputStreamReader(System.in));
		String				filename1 = reader.readLine();
		String				filename2 = reader.readLine();
		FileInputStream		fileInputStream = new FileInputStream(filename1);
		FileOutputStream	fileOutputStream = new FileOutputStream(filename2);
		ArrayList<Double>	d_arr = new ArrayList<>();
		ArrayList<Integer>	i_arr = new ArrayList<>();

		StringBuilder		num = new StringBuilder();

		while (fileInputStream.available() > 0) {

			char	c;
			while (fileInputStream.available() > 0 && (c = (char)fileInputStream.read()) != ' ')
				num.append(c);
			d_arr.add(Double.parseDouble(num.toString()));
			num.delete(0, num.length());
		}

		for (Double n : d_arr) {
			double	nb = n;
			int		res;

			if (Math.abs(nb) - Math.abs((int)nb) >= 0.50 && nb >= 0)
				res = (int)nb + 1;
			else if (Math.abs(nb) - Math.abs((int)nb) > 0.50 && nb < 0)
				res = (int)nb - 1;
			else
				res = (int)nb;
			i_arr.add(res);
		}

		for (Integer n : i_arr)
			fileOutputStream.write(n.toString().concat(" ").getBytes());

		fileInputStream.close();
		fileOutputStream.close();
	}
}
