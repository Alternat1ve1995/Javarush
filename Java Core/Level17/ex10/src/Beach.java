
/*
Comparable
*/

public class Beach implements Comparable<Beach> {
	private String name;      //название
	private float distance;   //расстояние
	private int quality;    //качество

	public Beach(String name, float distance, int quality) {
		this.name = name;
		this.distance = distance;
		this.quality = quality;
	}

	@Override
	public synchronized int compareTo(Beach beach) {
		float   b1 = this.getQuality() - this.getDistance();
		float   b2 = beach.getQuality() - beach.getDistance();

		return ((int)(b1 - b2));
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized float getDistance() {
		return distance;
	}

	public synchronized void setDistance(float distance) {
		this.distance = distance;
	}

	public synchronized int getQuality() {
		return quality;
	}

	public synchronized void setQuality(int quality) {
		this.quality = quality;
	}

	public static void main(String[] args) {

	}
}
