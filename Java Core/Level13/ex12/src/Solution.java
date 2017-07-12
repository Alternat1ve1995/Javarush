
import java.awt.*;

/* 
Лисица — это такое животное
*/

public class Solution {
	public static void main(String[] args) throws Exception {
	}

	public interface Animal {
		Color getColor();
	}

	public static abstract class Fox implements Animal {
		public String getName() {
			return "Fox";
		}
	}
}