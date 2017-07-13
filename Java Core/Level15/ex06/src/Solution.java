
/*
ООП - Перегрузка
*/

public class Solution {
	public static void main(String[] args) {
		printMatrix(2, 3, "8");
	}

	public static void printMatrix(int m, int n, String value) {
		System.out.println("Заполняем объектами String");
		printMatrix(m, n, (Object) value);
	}

	public static void printMatrix(int m, int n, Object value) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(value);
			}
			System.out.println();
		}
	}

	public static void printMatrix(double m, double n, int k) {

	}

	public static void printMatrix(double m, double n, int[] arr) {

	}

	public static void printMatrix(double m, int n) {

	}

	public static void printMatrix(int m, double n) {

	}

	public static void printMatrix(short m, short n) {

	}

	public static void printMatrix(byte m, byte n) {

	}

	public static void printMatrix(double m, double n, short c) {

	}

	public static void printMatrix(double m, double n, double z) {

	}
}
