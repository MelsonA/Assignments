package MultiThreading;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Mythread mythread = new Mythread();
		Mythread.main=Thread.currentThread();
		Thread thread = new Thread(mythread);
		
		thread.start();
		thread.join();
		for(int i=0;i<5;i++) {
			System.out.println("from main");
		}
	}

}

 class Mythread implements Runnable{
      static Thread main;
	 public void run() {
		 for(int i=0;i<5;i++) {
			 System.out.println("from child");
			 try {
				main.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
  }
}
