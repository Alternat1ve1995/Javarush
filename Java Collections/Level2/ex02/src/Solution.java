
/* 
Пишем стек-трейс
*/
public class Solution {
	public static void main(String[] args) {
		String text = getStackTrace(new IndexOutOfBoundsException("fff"));
		System.out.println(text);
	}

	public static String getStackTrace(Throwable throwable) {
		return null;
	}
}