
package com.Allen.This;



public class Student {

	public Student() {
		// 定义一个方法，名字与类相同故为构造方法
		this("hello");
		System.out.println("我进来了无参数构造函数");
	}

	public Student(String name) { // 定义一个带形式参数的构造方法
		System.out.println(name);
		System.out.println("我进来了有参数构造函数");
	}


	public static void main(String[] args) {

		Student student = new Student();
		System.out.println(student.hashCode());
	}

}

