import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TaskTimer {

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

	public static String readFileToStringBuilder(String filename) {

		
		StringBuilder data = new StringBuilder();
		InputStream in = null;
		InputStreamReader reader;
		try {
	
			in = new FileInputStream(filename);
	
			reader = new InputStreamReader(in);
			
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				data.append((char)c);
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
		return data.toString();

	}

	
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

}
