import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * StringBuilderTask is class read file and append to StringBuilder
 * @author Atid Srisukhantapuek
 */
public class StringBuilderTask implements Runnable{
	private String size;
	/** Read file
	 * @return Appended string 
	 */
	public static String readFileToStringBuilder(String filename) {

		String result = "";
		StringBuilder builder;
		FileReader reader ;
		try {
	
			reader = new FileReader(filename);
			builder = new StringBuilder();
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				 builder.append((char)c);
			}
			result = builder.toString();

			
			 if (reader != null ) reader.close( );

		} catch (FileNotFoundException e) {
			System.out.println("File not Found" + filename);

		} catch (IOException e) {
			e.getMessage();
		}

	
		return result;

	}
	/** Run */
	@Override
	public void run() {
		 size = readFileToStringBuilder("C:/Users/Username/Downloads/Alice-in-Wonderland.txt");
	}
	/**Get description of readfile result*/

	public String toString() {
		return String.format("Task: Read file gAlice-in-Wonderlandh %d and append to String ",size.length());
	}

}
