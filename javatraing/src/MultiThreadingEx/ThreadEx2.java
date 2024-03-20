package MultiThreadingEx;

public class ThreadEx2 {
	public static void main(String[] args) {
		ThreadEx1 thread2 = new ThreadEx1();
		thread2.start();
		for(int i=0; i<10; i++) {
			System.out.println("parent class");
			}
		
	}
}
