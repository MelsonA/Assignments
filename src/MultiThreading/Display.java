package MultiThreading;

public class Display {
	
	public  void print(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("hello ");
			synchronized (name){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(name);
		}
	}

}
