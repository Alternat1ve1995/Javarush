
/*
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
	public static void main(String[] args) {
	}

	public static class Human {
		private String      name;
		private String      surname;
		private int         age;
		private boolean     sex;
		private String      country;
		private Date        birth;

		public Human(String name) {
			this.name = name;
		}

		public Human(String name, String surname) {
			this.name = name;
			this.surname= surname;
		}

		public Human(String name, String surname, int age) {
			this.name = name;
			this.surname= surname;
			this.age = age;
		}

		public Human(String name, String surname, int age, boolean sex) {
			this.name = name;
			this.surname= surname;
			this.age = age;
			this.sex = sex;
		}

		public Human(String name, String surname, int age, boolean sex, String country) {
			this.name = name;
			this.surname= surname;
			this.age = age;
			this.sex = sex;
			this.country = country;
		}

		public Human(String name, String surname, int age, boolean sex, String country, Date birth) {
			this.name = name;
			this.surname= surname;
			this.age = age;
			this.sex = sex;
			this.country = country;
			this.birth = birth;
		}

		public Human(String name, String surname, boolean sex) {
			this.name = name;
			this.surname= surname;
			this.sex = sex;
		}

		public Human(String name, String surname, String country) {
			this.name = name;
			this.surname= surname;
			this.country = country;
		}

		public Human(String name, boolean sex) {
			this.name = name;
			this.sex = sex;
		}

		public Human(String name, boolean sex, Date birth) {
			this.name = name;
			this.sex = sex;
			this.birth = birth;
		}
	}
}
