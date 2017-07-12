
/*
Кошки не должны быть абстрактными!
*/

public class Solution {
	public static void main(String[] args) {

	}

	public static abstract class Pet {
		public abstract String getName();

		public abstract Pet getChild();
	}

	public static class Cat extends Pet {

		@Override
		public String   getName() {
			return ("Кот");
		}

		@Override
		public Pet      getChild() {
			return (new Cat());
		}
	}

	public static class Dog extends Pet {

		@Override
		public String   getName() {
			return ("Собака");
		}

		@Override
		public Pet      getChild() {
			return (new Dog());
		}
	}

}
