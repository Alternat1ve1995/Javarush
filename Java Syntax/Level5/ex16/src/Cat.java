
/*
Конструируем котиков
*/

public class Cat {

	public String   name;
	public int      age;
	public int      weight;
	public String   address;
	public String   color;

	public Cat(String name) {
		this.name = name;
		this.age = 3;
		this.weight = 3;
		this.color = "undefined";
	}

	public Cat(String name, int weight, int age) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = "undefined";
	}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = 3;
		this.color = "undefined";
	}

	public Cat(int weight, String color) {
		this.weight = weight;
		this.color = color;
		this.age = 3;
	}

	public Cat(int weight, String color, String address) {
		this.weight = weight;
		this.address = address;
		this.color = color;
		this.age = 3;
	}

	public static void main(String[] args) {

	}
}
