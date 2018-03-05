/**
 * This is class for run all Task
 * 
 */
public class Main {

	public static void main(String[] args) {


		TaskTimer.measureAndPrint(new StringTask());
		
		TaskTimer.measureAndPrint(new StringBuilderTask());

		TaskTimer.measureAndPrint(new BufferedReaderTask());
	}
}
