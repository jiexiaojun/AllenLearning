package allen._00_10;

public class Test10 implements Runnable {

	    private Test09 account;    // 存入账户
	    private double money;       // 存入金额
	 
	    public Test10(Test09 account, double money) {
	        this.account = account;
	        this.money = money;
	    }
	 
	    public void run() {
//	    	synchronized (account) {
//	            account.deposit(money); 
//	        }
	    	account.deposit(money);
	    }
	
}
