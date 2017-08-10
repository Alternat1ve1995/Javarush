import java.io.File;

/*
Проход по дереву файлов
*/
public class Solution {
	public static void main(String[] args) {

	}

	public static void deleteFile(File file) {
		if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
	}
}
