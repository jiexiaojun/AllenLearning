package allen._91_99;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
	//采用volatile
    public volatile int volatileinc = 0;
     
    public void volatileincrease() {
    	volatileinc++;
    }
    //采用synchronized
    public  int synchronizedinc = 0;
    public synchronized void synchronizedincrease() {
    	synchronizedinc++;
    } 
    //采用Lock
    public  int lockinc = 0;
    Lock lock = new ReentrantLock();
    public  void lockincrease() {
        lock.lock();
        try {
        	lockinc++;
        } finally{
            lock.unlock();
        }
    }
 
    public static void main(String[] args) {
    	
        final Test testvolatile = new Test();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                    	testvolatile.volatileincrease();
                };
            }.start();
        }      
        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println("采用volatile得到的结果：");
        System.err.println(testvolatile.volatileinc);
        
        final Test testsynchronized = new Test();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                    	testsynchronized.synchronizedincrease();
                };
            }.start();
        }      
        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println("采用synchronized得到的结果：");
        System.out.println(testsynchronized.synchronizedinc);
        
        final Test testLock = new Test();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                    	testLock.lockincrease();
                };
            }.start();
        }      
        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println("采用lock得到的结果：");
        System.out.println(testLock.lockinc);
    }
}