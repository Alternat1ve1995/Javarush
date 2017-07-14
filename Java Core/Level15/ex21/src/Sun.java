
public class Sun implements Planet {

	private static Sun instance = null;

	private static class PlanetInit {
		private static final Sun instance = new Sun();
	}

	private Sun() {}

	public static Sun   getInstance() {

		instance = PlanetInit.instance;
		return (instance);
	}
}
