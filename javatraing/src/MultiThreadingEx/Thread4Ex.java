package MultiThreadingEx;

public class Thread4Ex {
	public static void main(String[] args) {
		Thread3Ex thread3 = new Thread3Ex();
		thread3.start();
		for(int i=0; i<10; i++) {
			System.out.println("parent class");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	}
}
