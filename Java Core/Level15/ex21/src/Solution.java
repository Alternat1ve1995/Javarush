
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Закрепляем паттерн Singleton
*/

public class Solution {

	static {
		readKeyFromConsoleAndInitPlanet();
	}

	public static void main(String[] args) {

	}

	public static Planet thePlanet;


	public static void readKeyFromConsoleAndInitPlanet() {

		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		String  plName = null;

		try {plName = reader.readLine();}
		catch (Exception e) {return;}
		if (plName.equals(Planet.EARTH))
			thePlanet = Earth.getInstance();
		else if (plName.equals(Planet.MOON))
			thePlanet = Moon.getInstance();
		else if (plName.equals(Planet.SUN))
			thePlanet = Sun.getInstance();
		else
			thePlanet = null;
	}
}
