
/*
DownloadException
*/

import java.io.*;

public class Solution {
	public static void main(String[] args) throws DownloadException {

		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		FileInputStream		fileInputStream = null;

		try {
			while (true) {
				fileInputStream = new FileInputStream(reader.readLine());
				if (fileInputStream.available() < 1000)
					break;
				fileInputStream.close();
			}
			fileInputStream.close();
			throw new DownloadException();
		}
		catch (IOException e2) {}

	}

	public static class DownloadException extends Exception {

	}
}
