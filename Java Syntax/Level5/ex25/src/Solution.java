
/*
Мужчина и женщина
*/

import java.util.Map;

public class Solution {
	public static void main(String[] args) {

		Man     man1 = new Man("Man1", 20, "Kiev");
		Man     man2 = new Man("Man2", 21, "Kiev");

		Woman   woman1 = new Woman("Woman1", 22, "Kiev");
		Woman   woman2 = new Woman("Woman2", 25, "Kiev");

		System.out.println(man1.toString());
		System.out.println(man2.toString());
		System.out.println(woman1.toString());
		System.out.println(woman2.toString());
	}

	public static class Man {
		public String   name;
		public int      age;
		public String   address;

		public Man(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public String   toString() {
			return (this.name + " " + this.age + " " + this.address);
		}
	}

	public static class Woman {
		public String   name;
		public int      age;
		public String   address;

		public Woman(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public String   toString() {
			return (this.name + " " + this.age + " " + this.address);
		}
	}
}
