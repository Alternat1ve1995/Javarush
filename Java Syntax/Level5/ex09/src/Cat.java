
/*
Кошкоинициация
*/

public class Cat {

	private String name;
	private int age;
	private int weight;
	private String address;
	private String color;

	public void initialize(String name){
		this.name = name;
		this.age = 5;
		this.weight = 10;
		this.color = "серый";
	}

	public void initialize(String name, int weigth, int age){
		this.name = name;
		this.age = age;
		this.weight = weigth;
		this.color = "серый";
	}

	public void initialize(String name, int age){
		this.name = name;
		this.age = age;
		this.weight = 10;
		this.color = "серый";
	}

	public void initialize(int weight, String color){
		this.age = 3;
		this.weight = weight;
		this.color = color;
	}

	public void initialize(int weight, String color, String address){
		this.age = 5;
		this.weight = weight;
		this.color = color;
		this.address = address;
	}

	public static void main(String[] args) {

	}
}
