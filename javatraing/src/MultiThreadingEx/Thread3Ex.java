package MultiThreadingEx;

public class Thread3Ex extends Thread {
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
		System.out.println("child thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}


