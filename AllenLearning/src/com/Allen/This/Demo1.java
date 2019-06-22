
package com.Allen.This;


public class Demo1 {

	String str = "这是成员变量";

	void fun(String str1) {
		System.out.println(str1);
		System.out.println(str);
	}


	public static void main(String[] args) {

		Demo1 demo = new Demo1();
		demo.fun("这是局部变量");

	}

}

