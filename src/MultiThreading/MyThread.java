package MultiThreading;

public class MyThread implements Runnable{
	
	Display display;
	String name;
	

	public MyThread(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}


	@Override
	public void run() {
		display.print(name);
		
	}

}
