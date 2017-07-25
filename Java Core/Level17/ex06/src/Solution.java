
/*
МВФ
*/

public class Solution {
	public static void main(String[] args) {
		IMF fund = IMF.getFund();
		IMF anotherFund = IMF.getFund();
		System.out.println(fund == anotherFund );
	}
}
