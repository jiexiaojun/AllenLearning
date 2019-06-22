package com.Allen.Thread;

import java.util.concurrent.CountDownLatch;

public class ThreadAddLatch {

	/** 
	 * @Description: 利用四个线程计算1+2+...+100
	 * 使用countDownLatch
	 * @param args void  
	 * @author Jie.xiaojun
	 * @date 2018-6-15  下午10:55:55
	 */

	public static int sum = 0;
	public static Object LOCK = new Object();
	public static CountDownLatch countdown = new CountDownLatch(4);

	public static void main(String[] args) throws InterruptedException {
		ThreadAddLatch add = new ThreadAddLatch();
		ThreadTest thread1 = add.new ThreadTest(1, 25);
		ThreadTest thread2 = add.new ThreadTest(26, 50);
		ThreadTest thread3 = add.new ThreadTest(51, 75);
		ThreadTest thread4 = add.new ThreadTest(76, 100);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		countdown.await();
		System.out.println("total result: " + sum);
	}

	class ThreadTest extends Thread {
		private int begin;
		private int end;

		@Override
		public void run() {
			synchronized (LOCK) {
				for (int i = begin; i <= end; i++) {
					sum += i;
				}
				System.out.println("from " + Thread.currentThread().getName() + " sum=" + sum);
			}
			countdown.countDown();
		}

		public ThreadTest(int begin, int end) {
			this.begin = begin;
			this.end = end;
		}
	}

}
