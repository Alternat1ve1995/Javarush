
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Метод в try..catch
*/

public class Solution {
	public static void main(String[] args) {
		readData();
	}

	public static void readData() {

		BufferedReader      read = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer>  list = new ArrayList<>();

		try
		{
			while (true) {
				list.add(Integer.parseInt(read.readLine()));
			}
		}
		catch (Exception e)
		{
			for (Integer n : list) {
				System.out.println(n);
			}
		}
	}
}
