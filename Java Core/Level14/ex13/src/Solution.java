
/*
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {

		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		String			movieType = null;

		while (true) {
			try
			{
				movieType = reader.readLine();
				Movie	movie = MovieFactory.getMovie(movieType);
				System.out.println(movie.getClass().getSimpleName());
				if (!(movieType.equals("cartoon") || movieType.equals("thriller") || movieType.equals("soapOpera")))
					break;
			}
			catch (NullPointerException e)
			{
				break;
			}
		}
	}

	static class MovieFactory {

		static Movie getMovie(String key) {
			Movie movie = null;

			//создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
			if ("soapOpera".equals(key)) {
				movie = new SoapOpera();
			}
			else if ("cartoon".equals(key)) {
				movie = new Cartoon();
			}
			else if ("thriller".equals(key)) {
				movie = new Thriller();
			}

			return movie;
		}
	}

	static abstract class Movie {
	}

	static class SoapOpera extends Movie {
	}

	static class Cartoon extends Movie {

	}

	static class Thriller extends Movie {

	}
}
