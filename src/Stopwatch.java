/**
 *  Stopwatch class is class that computes elapsed time between a start and stop time
 *   
 *  @author Atid Srisukhantapuek
 *  
 */
public class Stopwatch {

	/** To check Stop watch is running*/
	private boolean Running = false;
	/** Start time of stopwatch*/
	private double timeStart ;
	/** Stop time of stopwatch*/
	private double timeStop;
	/**Nanoseconds*/
	private final double NANOSEC = 1.0E-9;
	
	/**
	 * Start the stopwatch
	 */
	public void start() {
		if(Running) return;
		Running = true;
		timeStart = System.nanoTime();
	}
	
	/** Stop the stopwatch*/
	public void stop() {
		if(!Running) return;
		Running = false;
		timeStop = System.nanoTime();
	}
	/** 
	 * Check stopwatch is running or not
	 * @return True if stopwatch is Running
	 */
	public boolean isRunning() {
		return Running;
	}
	/** 
	 * Get Elacpsed time
	 * @return Elacpsed
	 */
	public double getElacpsed() {
		
		if(isRunning()) {
			return (System.nanoTime() - timeStart)*NANOSEC;
		}else {
			return (timeStop - timeStart)*NANOSEC;
		}
	
	}

}
