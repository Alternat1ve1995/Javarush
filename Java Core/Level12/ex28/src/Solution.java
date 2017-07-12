
/*
Родитель класса CTO
*/

public class Solution {

	public static void main(String[] args) {
		CTO cto = new CTO();
		System.out.println(cto);
	}

	public static interface Businessman {
		public void workHard();
	}

	public static class TechLead {

		public void workHard() {}
	}

	public static class CTO extends TechLead implements Businessman {

	}
}
