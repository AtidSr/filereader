import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * StringTask is class that read file and append to String
 * @author Atid Srisukhantapuek
 */
public class StringTask implements Runnable {

	private String size;
	/**
	 * read file and append to string
	 * @return Appended string
	 */
	public static String readFileToString(String filename) {
		// open file
		// read a charactor
		// read the file
		// create a string for a data
		// close file

		String data = "";
		InputStream in = null;
		InputStreamReader reader;
		try {
			// open file
			in = new FileInputStream(filename);
			// read a charactor
			reader = new InputStreamReader(in);
			// read the file
			int c;
			while (true) { // while((c=reader.read())>=0)
				c = reader.read();
				if (c < 0)
					break;
				data = data + (char) c;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found" + filename);

		} catch (IOException e) {
			e.getMessage();
		}

		if (in != null)
			try {
				in.close();
			} catch (IOException e) {

			}
		return data;

	}
	/**Run */
	@Override
	public void run() {
		 size = readFileToString("C:/Users/Username/Downloads/Alice-in-Wonderland.txt");
	}
	/**Get description of readfile result*/

	public String toString() {
		return String.format("Task: Read file gAlice-in-Wonderlandh %d ",size.length());
	}
}
