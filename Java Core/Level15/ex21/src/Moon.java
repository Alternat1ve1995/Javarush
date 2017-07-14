
	public class Moon implements Planet {

		private static Moon instance = null;

		private static class PlanetInit {
			private static final Moon instance = new Moon();
		}

		private Moon() {}

		public static Moon   getInstance() {
			instance = PlanetInit.instance;
			return (instance);
		}
	}
