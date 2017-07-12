
/*
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
	public static void main(String[] args) {

	}

	public interface Run {
		public void run();
	}

	public interface Swim {
		public void swim();
	}

	public static abstract class Human implements Run, Swim {

	}
}
