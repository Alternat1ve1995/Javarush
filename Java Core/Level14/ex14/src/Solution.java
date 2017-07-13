
import java.util.ArrayList;
import java.util.List;

/*
Клининговый центр
*/

public class Solution {
	public static void main(String[] args) {
		List<Apartment> apartments = new ArrayList<Apartment>();
		apartments.add(new Apt1Room());
		apartments.add(new Apt2Room());
		apartments.add(new Apt3Room());

		cleanAllApartments(apartments);
	}

	public static void cleanAllApartments(List<Apartment> apartments) {

		for (Apartment apt : apartments) {
			if (apt instanceof Apt1Room)
				((Apt1Room) apt).clean1Room();
			else if (apt instanceof Apt2Room)
				((Apt2Room) apt).clean2Rooms();
			else if (apt instanceof Apt3Room)
				((Apt3Room) apt).clean3Rooms();
		}
	}

	static interface Apartment {
	}

	static class Apt1Room implements Apartment {
		void clean1Room() {
			System.out.println("1 room is cleaned");
		}
	}

	static class Apt2Room implements Apartment {
		void clean2Rooms() {
			System.out.println("2 rooms are cleaned");
		}
	}

	static class Apt3Room implements Apartment {
		void clean3Rooms() {
			System.out.println("3 rooms are cleaned");
		}
	}
}
