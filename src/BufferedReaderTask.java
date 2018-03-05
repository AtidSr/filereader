import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * BufferedReaderTask is class read file by using BufferedReader
 * @author Atid Srisukhantapuek
 */
public class BufferedReaderTask implements Runnable{

	/**Size or number of string in file*/
	private String size;
	
	/**
	 * Read file by using BufferedReader
	 * @return Appended string
	 */
	public static String readFileBufferedReader(String filename) {
		FileReader reader;
		BufferedReader br = null;
		String result = null;
		try {
			reader = new FileReader(filename);
			 br = new BufferedReader(reader);
			result = "";
			String line;
			while((line = br.readLine())!= null) {
				result = result + line + '\n'; 
			}
		} catch (FileNotFoundException e) {

			e.getMessage();
		} catch (IOException e) {

			e.getMessage();
		}
		
		if(br != null)
			try {
				br.close();
			} catch (IOException e) {

			}
		return result;
		
	}
	/**Run file reader*/
	@Override
	public void run() {
		 size = readFileBufferedReader("C:/Users/Username/Downloads/Alice-in-Wonderland.txt");
	}
	/**Get description of readfile result*/
	public String toString() {
		return String.format("Task: Read file ÅgAlice-in-WonderlandÅh %d by BufferedReader ",size.length());
	}
}
