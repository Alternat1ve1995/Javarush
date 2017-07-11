
import java.util.ArrayList;

/*
Статические коты
*/

public class Cat {

	public static ArrayList<Cat> cats = new ArrayList<>();

	public Cat() {

	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++)
			Cat.cats.add(new Cat());
		printCats();
	}

	public static void printCats() {

		for (Cat currCat : Cat.cats) {
			System.out.println(currCat);
		}
	}
}
