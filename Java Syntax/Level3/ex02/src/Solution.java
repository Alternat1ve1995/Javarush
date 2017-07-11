
/*
Обмен валют
*/

public class Solution {
	public static void main(String[] args) {
		System.out.println(convertEurToUsd(10, 1.5));
		System.out.println(convertEurToUsd(15, 1.3));
	}

	public static double convertEurToUsd(int eur, double course) {
		return (course * eur);
	}
}
