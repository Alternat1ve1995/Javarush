
import java.io.*;

public class Solution {
	public static String firstFileName;
	public static String secondFileName;

	static {
		BufferedReader  sreader = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			firstFileName = sreader.readLine();
			secondFileName = sreader.readLine();
		}
		catch (Exception e) {System.exit(-1);}
	}

	public static void main(String[] args) throws InterruptedException {
		systemOutPrintln(firstFileName);
		systemOutPrintln(secondFileName);
	}

	public static void systemOutPrintln(String fileName) throws InterruptedException {
		ReadFileInterface f = new ReadFileThread();
		f.setFileName(fileName);
		f.start();
		f.join();
		System.out.println(f.getFileContent());
	}

	public interface ReadFileInterface {

		void setFileName(String fullFileName);

		String getFileContent();

		void join() throws InterruptedException;

		void start();
	}

	public static class ReadFileThread extends Thread implements ReadFileInterface {

		private String  filename;
		private String  filecontent = "";

		@Override
		public void run() {

			try
			{
				File    file = new File(filename);
				BufferedReader  fread = new BufferedReader(new FileReader(file.getAbsoluteFile()));

				String  buff = null;

				while ((buff = fread.readLine()) != null)
					this.filecontent += buff + " ";
			}
			catch (Exception e) {}
		}

		@Override
		public void setFileName(String fullFileName) {
			this.filename = fullFileName;
		}

		@Override
		public String getFileContent() {
			return (this.filecontent);
		}
	}
}
