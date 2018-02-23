
public class BufferedReaderTask implements Runnable{

	private String size;
	@Override
	public void run() {
		 size = TaskTimer.readFileBufferedReader("C:/Users/Username/Downloads/Alice-in-Wonderland.txt");
	}
	
	public String toString() {
		return String.format("Task: Read file ÅgAlice-in-WonderlandÅh %d by BufferedReader ",size.length());
	}
}
