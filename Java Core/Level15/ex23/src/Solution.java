/*
Порядок загрузки переменных
*/

public class Solution {

	static {
		init();
	}

	public static void init() {
		System.out.println("static void init()");
	}

	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		System.out.println("public static void main");
		Solution s = new Solution();
	}

	{
		System.out.println("non-static block");
		printAllFields(this);
	}

	public static void printAllFields(Solution obj) {
		System.out.println("static void printAllFields");
		System.out.println(obj.i);
		System.out.println(obj.name);
	}

	public int i = 6;

	public String name = "First name";

	public Solution() {
		System.out.println("Solution constructor");
		printAllFields(this);
	}

}
