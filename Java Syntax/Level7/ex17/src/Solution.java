
public class Solution {
	public static void main(String[] args) {

		Human	grandpa1 = new Human("Grandpa1", true, 60);
		Human	grandpa2 = new Human("Grandpa2", true, 65);
		Human	gramdma1 = new Human("Grandma1", false, 60);
		Human	grandma2 = new Human("Grandma2", false, 65);
		Human	farher	= new Human("Father", true, 45, grandpa1, gramdma1);
		Human	mother = new Human("Mother", false, 44, grandpa2, grandma2);
		Human	child1 = new Human("Child1", true, 21, farher, mother);
		Human	child2 = new Human("Child2", false, 19, farher, mother);
		Human	child3 = new Human("Child3", true, 12, farher, mother);

		System.out.println(gramdma1.toString());
		System.out.println(grandma2.toString());
		System.out.println(grandpa1.toString());
		System.out.println(grandpa2.toString());
		System.out.println(farher.toString());
		System.out.println(mother.toString());
		System.out.println(child1.toString());
		System.out.println(child2.toString());
		System.out.println(child3.toString());
	}

	public static class Human {
		private String	name;
		private boolean	sex;
		private int		age;
		private Human	father = null;
		private Human	mother = null;

		public Human (String name, boolean sex, int age) {
			this.name = name;
			this.sex = sex;
			this.age = age;
		}

		public Human (String name, boolean sex, int age, Human father, Human mother) {
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.father = father;
			this.mother = mother;
		}

		public String toString() {
			String text = "";
			text += "Имя: " + this.name;
			text += ", пол: " + (this.sex ? "мужской" : "женский");
			text += ", возраст: " + this.age;

			if (this.father != null)
				text += ", отец: " + this.father.name;

			if (this.mother != null)
				text += ", мать: " + this.mother.name;

			return text;
		}
	}
}