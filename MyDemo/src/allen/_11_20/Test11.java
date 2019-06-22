package allen._11_20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import allen._00_10.Test09;
import allen._00_10.Test10;

public class Test11 {

	
		public static void main(String[] args) 
		{
			Test09 account = new Test09();
			ExecutorService service = Executors.newFixedThreadPool(100);
	
			for(int i = 1; i <= 100; i++) 
			{
				service.execute(new Test10(account, 1));
			}
			
			service.shutdown();
			while(!service.isTerminated()) {}
			
			System.out.println("账户余额: " + account.getBalance());
		}
}
