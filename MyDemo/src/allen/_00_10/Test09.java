package allen._00_10;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Test09 {
	
	 private Lock accountLock = new ReentrantLock();
	private double balance;     // 账户余额
	 
    /**
     * 存款
     * @param money 存入金额
     */
    public void deposit(double money) {
    	 accountLock.lock();
        double newBalance = balance + money;
        try {
            Thread.sleep(10);   // 模拟此业务需要一段处理时间
        }
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }finally
        {
        	accountLock.unlock();
        }
        balance = newBalance;
    }
 
    /**
     * 获得账户余额
     */
    public double getBalance() {
        return balance;
    }

}
