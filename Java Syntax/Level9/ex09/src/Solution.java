
import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
	public static void main(String[] args) throws Exception {
		try
		{
			ArrayList<String> list = new ArrayList<String>();
			String s = list.get(18);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}