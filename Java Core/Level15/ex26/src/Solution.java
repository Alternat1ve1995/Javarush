
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.*;
import java.util.ArrayList;

/*
Парсер реквестов
*/

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader      reader = new BufferedReader(new InputStreamReader(System.in));
		String              url = reader.readLine();
		ArrayList<String>   value = new ArrayList<>();
		String              var = "";
		Object              obj = null;
		String              temp = "";
		int                 i = 0;

		char[]          curl = url.toCharArray();

		while (i < curl.length){
			if (curl[i] == '?' || curl[i] == '&') {
				while (i < curl.length - 1 && curl[++i] != '=' && curl[i] != '&')
					temp += curl[i];
				if (temp.equals("obj")) {
					String  tmp = "";
					if (i < curl.length && curl[i] == '=')
						while (i < curl.length - 1 && curl[++i] !='&')
							tmp += curl[i];
					else
						tmp = null;
					value.add(tmp);
				}
				var += temp + " ";
				temp = "";
			}
			else
				i++;
		}
		var = var.substring(0, var.length() - 1);
		System.out.println(var);
		for (String vl : value) {
			try
			{
				double  d = Double.parseDouble(vl);
				alert(d);
			}
			catch (Exception e)
			{
				alert(vl);
			}
		}
	}

	public static void alert(double value) {
		System.out.println("double " + value);
	}

	public static void alert(String value) {
		System.out.println("String " + value);
	}
}
