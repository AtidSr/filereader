
public class Stopwatch {

	private boolean Running = false;
	private double timeStart ;
	private double timeStop;
	private final double NANOSEC = 1.0E-9;
	
	public void start() {
		if(Running) return;
		Running = true;
		timeStart = System.nanoTime();
	}
	public void stop() {
		if(!Running) return;
		Running = false;
		timeStop = System.nanoTime();
	}
	
	public boolean isRunning() {
		return Running;
	}
	
	public double getElacpsed() {
		
		if(isRunning()) {
			return (System.nanoTime() - timeStart)*NANOSEC;
		}else {
			return (timeStop - timeStart)*NANOSEC;
		}
	
	}

}
