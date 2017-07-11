
/* 
Наш первый конвертер!
*/

public class Solution {
	public static void main(String[] args) {
		System.out.println(convertCelsiumToFahrenheit(40));
	}

	public static double convertCelsiumToFahrenheit(int celsium) {

		double f = 1.0 * celsium * 9 / 5 + 32;

		return (f);
	}
}