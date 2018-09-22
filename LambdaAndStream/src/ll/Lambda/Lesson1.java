/**
 * @项目名称：LearnProject
 * @文件名称：Lesson1.java
 * @所属包名：ll.Lambda
 * @创建时间：2018年9月5日上午9:15:30
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Lambda;

/**
 * @类名称：Lesson1
 * @类描述：学习lambda表达式
 * @创建人：jie.xiaojun
 * @创建时间：2018年9月5日 上午9:15:30
 */
public class Lesson1 {

	// 接口
	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}

	public static void main(String... args) {

		Lesson1 myApp = new Lesson1();
		// 实例1
		IntegerMath addition = (a, b) -> a + b;
		// 实例2
		IntegerMath subtraction = (a, b) -> a - b;

		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
	}


}

