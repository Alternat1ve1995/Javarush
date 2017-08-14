
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
public class Solution {
	public static void main(String[] args) throws IOException {

		String				fullPath = args[0];
		String				zipPath = args[1];

		FileOutputStream	zipArchiveOutputStream = new FileOutputStream(zipPath);
		ZipOutputStream		zipOutputStream = new ZipOutputStream(zipArchiveOutputStream);
		FileInputStream		readFile = new FileInputStream(fullPath);

		ZipEntry			archievableFile = new ZipEntry(fullPath);

		zipOutputStream.putNextEntry(archievableFile);

		byte[]				buff = new byte[readFile.available()];
		readFile.read(buff);

		zipOutputStream.write(buff);

		ZipInputStream		zipInputStream = new ZipInputStream(new FileInputStream(zipPath));

		ZipEntry	entry;

		while ((entry = zipInputStream.getNextEntry()) != null) {
			System.out.println(entry.getName());
		}
	}
}
