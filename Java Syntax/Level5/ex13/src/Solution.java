
/*
Программист создает человека
*/

public class Solution {
	public static void main(String[] args) {

		Person  person = new Person();

		person.initialize("SomePerson", 21);
	}

	static class Person {
		String  name;
		int     age;

		public void initialize(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
}
