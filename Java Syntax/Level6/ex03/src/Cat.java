
/* 
Ставим котов на счётчик
*/

public class Cat {
	public static int catCount = 0;

	public Cat () {
		Cat.catCount++;
	}

	protected void finalize() throws Throwable {
		Cat.catCount--;
	}

	public static void main(String[] args) {

	}
}