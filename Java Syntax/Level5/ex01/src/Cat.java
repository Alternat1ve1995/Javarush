
/* 
Реализовать метод fight
*/

public class Cat {
	public String name;
	public int age;
	public int weight;
	public int strength;

	public Cat() {
	}

	public boolean fight(Cat anotherCat) {
		if (anotherCat.strength < this.strength)
			return (true);
		else if (anotherCat.strength > this.strength)
			return (false);
		else {
			if (anotherCat.weight < this.weight)
				return (true);
			else
				return (false);
		}
	}

	public static void main(String[] args) {

	}
}