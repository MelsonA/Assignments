package MultiThreading;

public class ProblemTest {
	
	public static void main(String[] args) {
		Display display = new Display();
		Display display1 = new Display();

		MyThread mythread = new MyThread(display,"john");
		MyThread mythread1 = new MyThread(display,"peter");

		Thread thread = new Thread(mythread);
		Thread thread1 = new Thread(mythread1);

		thread.start();
		thread1.start();
	}

}
