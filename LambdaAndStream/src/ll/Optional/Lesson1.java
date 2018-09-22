/**
 * @项目名称：LearnProject
 * @文件名称：Lesson1.java
 * @所属包名：ll.Optional
 * @创建时间：2018年9月8日下午3:11:54
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Optional;

import java.util.Optional;

/**
 * @类名称：Lesson1
 * @类描述：在更复杂的 if (xx != null) 的情况中，使用 Optional 代码的可读性更好，
 * 而且它提供的是编译时检查，能极大的降低 NPE 这种 Runtime Exception 对程序的影响，
 * 或者迫使程序员更早的在编码阶段处理空值问题，而不是留到运行时再发现和调试。
 * @创建人：改成自己名字
 * @创建时间：2018年9月8日 下午3:11:54
 */
public class Lesson1 {

	public static boolean printA(String text) {
		return Optional.ofNullable(text).isPresent();
	}

	public static boolean printB(String text) {
		if (text != null) {
			return true;
		}
		return false;
	}

	public static int getLengthA(String text) {
		// Java 8
		return Optional.ofNullable(text).map(String::length).orElse(-1);
	};

	public static int getLengthB(String text) {
		// Pre-Java 8
		return (text != null) ? text.length() : -1;
	};

	public static void main(String[] args) {
		String strA = " abcd ", strB = null;
		System.out.println(printA(strA));
		System.out.println(printA(strB));

		System.out.println(printB(strA));
		System.out.println(printB(strB));

		System.out.println(getLengthA(strA));
		System.out.println(getLengthA(""));
		System.out.println(getLengthB(strB));

	}

}

