
public class Singleton {

	private static Singleton	instance = null;

	private Singleton() {
		instance = this;
	}

	public static Singleton getInstance() {
		if (instance == null)
			new Singleton();
		return (instance);
	}
}
