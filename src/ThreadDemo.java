
public class ThreadDemo {

	public static void main(String[] args) {
		Runnable runnable = ()->{
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				};
				System.out.println("Running in the separate thread.." + Thread.currentThread().getName());
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("Inside the main thread ....");
	}

}
