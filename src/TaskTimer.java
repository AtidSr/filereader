import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 *  TaskTimer is class for measure and print result from file reader
 * 
 */
public class TaskTimer {

	/** measure and print result from file reader */
	public static void measureAndPrint(Runnable task) {

		Stopwatch a = new Stopwatch();
		a.start();
		task.run();
		a.stop();
		System.out.print(task.toString()+ a.getElacpsed()+ " seconds \n");
		
	}



	
	

}
