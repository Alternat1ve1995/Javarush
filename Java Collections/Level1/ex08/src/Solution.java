import java.io.File;

/*
Null Object Pattern
*/
public class Solution {
	private FileData fileData;

	public Solution(String pathToFile) {

		try {
			File	file = new File(pathToFile);

			this.fileData = new ConcreteFileData(file.isHidden(), file.canExecute(), file.isDirectory(), file.canWrite());
		}
		catch (Exception e)
		{
			this.fileData = new NullFileData(e);
		}
	}

	public FileData getFileData() {
		return fileData;
	}
}
