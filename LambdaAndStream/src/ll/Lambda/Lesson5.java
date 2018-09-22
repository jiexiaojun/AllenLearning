/**
 * @项目名称：LearnProject
 * @文件名称：Lesson5.java
 * @所属包名：ll.Lambda
 * @创建时间：2018年9月7日上午10:21:30
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Lambda;

import java.awt.event.ActionEvent;
import java.util.EventListener;

/**
 * @类名称：Lesson5
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月7日 上午10:21:30
 */
public class Lesson5 {

	// java.util.Comparator
	public interface Comparator<T> {
		int compare(T o1, T o2);
	}

	// 对compare的一个实现
	static Comparator<Integer> llComparator = (a, b) -> {
		if (a > b) {
			return 1;
		}
		else if (a == b) {
			return 1;
		}
		else {
			return -1;
		}
	};

	// java.lang.Runnable
	public interface Runnable {
		void run();
	}
	// java.awt.event.ActionListener
	public interface ActionListener extends EventListener {
		void actionPerformed(ActionEvent e);
	}
	// java.util.concurrent.Callable
	public interface Callable<V> {
		V call();
	}
	// java.security.PrivilegedAction
	public interface PrivilegedAction<V> {
		V run();
	}

	public static void process(Runnable r) {
		r.run();
	}

	public static int compare(int a, int b, Comparator<Integer> c) {
		return c.compare(a, b);
	}

	public static void main(String[] args) {
		// 使用Lambda实例化runnable
		Runnable r1 = () -> System.out.println("Hello World 1");
		// 使用匿名类,实例化runnable
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("Hello World 2");
			}
		};

		process(r1);
		process(r2);
		// 直接传递Lambda表达式
		process(() -> System.out.println("Hello World 3"));

		System.out.println(compare(5, 6, (a, b) -> {
			if (a > b) {
				return 1;
			}
			else if (a == b) {
				return 1;
			}
			else {
				return -1;
			}
		}));
	}
}

