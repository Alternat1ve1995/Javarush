
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

public class Solution {
	public static List<String> allLines = new ArrayList<String>();
	public static List<String> forRemoveLines = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		Solution    solution = new Solution();
		BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader  fread1 = new BufferedReader(new FileReader(new File(reader.readLine()).getAbsoluteFile()));
		BufferedReader  fread2 = new BufferedReader(new FileReader(new File(reader.readLine()).getAbsoluteFile()));
		String          data;

		while ((data = fread1.readLine()) != null)
			allLines.add(data);
		while ((data = fread2.readLine()) != null)
			forRemoveLines.add(data);
		reader.close();
		fread1.close();
		fread2.close();
		try
		{
			solution.joinData();
		}
		catch (CorruptedDataException e) {}
	}

	public void joinData () throws CorruptedDataException, IOException {

		if (allLines.containsAll(forRemoveLines))
			allLines.removeAll(forRemoveLines);
		else {
			allLines.clear();
			throw new CorruptedDataException();
		}
	}
}
