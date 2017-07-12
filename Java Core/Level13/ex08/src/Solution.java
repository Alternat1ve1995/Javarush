
/* 
Всё, что движется
*/

public class Solution {

	public interface Movable {

		Double   speed();
	}

	public interface Flyable extends Movable {

		Double   speed(Flyable f);
	}

	public static void main(String[] args) throws Exception {
	}
}