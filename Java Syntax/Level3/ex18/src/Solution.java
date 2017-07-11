
/*
План по захвату мира
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader		reader = new BufferedReader(new InputStreamReader(System.in));

		int		years = Integer.parseInt(reader.readLine());
		String	name = reader.readLine();

		System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
	}
}
