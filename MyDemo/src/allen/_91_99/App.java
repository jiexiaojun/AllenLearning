
package allen._91_99;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class App {
	
	static Thread thread1 = new Thread(new Runnable() {
		public void run() {
			System.out.println("thread1");
		}
	});
	
	static Thread thread2 = new Thread(new Runnable() {
		public void run() {
			System.out.println("thread2");
		}
	});
	
	static Thread thread3 = new Thread(new Runnable() {
		public void run() {
			System.out.println("thread3");
		}
	});

	static ExecutorService executorService = Executors.newSingleThreadExecutor();//队列的方式 FIFO 先进先出
	
	public static void main(String[] args) throws InterruptedException {

		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();
		
		executorService.submit(thread1);
		executorService.submit(thread2);
		executorService.submit(thread3);
		executorService.shutdown();
		
	}

}

