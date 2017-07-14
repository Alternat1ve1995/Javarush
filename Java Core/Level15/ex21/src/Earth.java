
public class Earth implements Planet {

	private static Earth    instance = null;

	private static class PlanetInit {
		private static final Earth instance = new Earth();
	}

	private Earth() {}

	public static Earth   getInstance() {
		instance = PlanetInit.instance;
		return (instance);
	}
}
