
public class AppendStringTask implements Runnable{
	private String size;
	@Override
	public void run() {
		 size = TaskTimer.readFileToStringBuilder("C:/Users/Username/Downloads/Alice-in-Wonderland.txt");
	}
	
	public String toString() {
		return String.format("Task: Read file �gAlice-in-Wonderland�h %d and append to String ",size.length());
	}

}
