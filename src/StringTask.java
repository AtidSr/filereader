
public class StringTask implements Runnable {

	private String size;
	@Override
	public void run() {
		 size = TaskTimer.readFileToString("C:/Users/Username/Downloads/Alice-in-Wonderland.txt");
	}
	
	public String toString() {
		return String.format("Task: Read file �gAlice-in-Wonderland�h %d ",size.length());
	}
}
