
/*
Значения по умолчанию
*/

public class Solution {

	public int			intVar = 0;
	public double		doubleVar = 0.0;
	public Double		DoubleVar = 0.0;
	public boolean		booleanVar = false;
	public Object		ObjectVar = null;
	public Exception	ExceptionVar = null;
	public String		StringVar = null;

	public static void main(String[] args) {
		System.out.println(new Solution().intVar);
		System.out.println(new Solution().doubleVar);
		System.out.println(new Solution().DoubleVar);
		System.out.println(new Solution().booleanVar);
		System.out.println(new Solution().ObjectVar);
		System.out.println(new Solution().ExceptionVar);
		System.out.println(new Solution().StringVar);
	}
}
