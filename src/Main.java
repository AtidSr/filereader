
public class Main {

	public static void main(String[] args) {
		StringTask task1 = new StringTask();
		Stopwatch a = new Stopwatch();
		a.start();
		task1.run();
		a.stop();
		System.out.print(task1.toString()+ a.getElacpsed()+ " seconds \n");
		
		AppendStringTask task2 = new AppendStringTask();
		Stopwatch b = new Stopwatch();
		b.start();
		task2.run();
		b.stop();
		System.out.print(task2.toString()+ a.getElacpsed()+ " seconds \n");

		BufferedReaderTask task3 = new BufferedReaderTask();
		Stopwatch c = new Stopwatch();
		c.start();
		task3.run();
		c.stop();
		System.out.print(task3.toString()+ a.getElacpsed()+ " seconds \n");
	}
}
