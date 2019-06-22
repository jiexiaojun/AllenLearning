
package com.Allen.This;


public class Demo {

	String str = "这是成员变量";

	void fun(String str) {
		System.out.println(str);
		System.out.println(this.str);
		this.str = str;
		System.out.println(this.str);
	}


	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.fun("这是局部变量");

	}

}

