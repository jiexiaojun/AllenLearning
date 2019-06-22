
package com.Allen.This;

/**
 * @类名称：This
 * @类描述：当需要返回当前对象的引用时，就常常在方法写return this;
 * 这种做法的好处是：当你使用一个对象调用该方法，该方法返回的是经过修改后的对象，且又能使用该对象做其他的操作。因此很容易对一个对象进行多次操作。
 * @创建人：jie.xiaojun
 * @创建时间：2018年12月15日 下午4:38:23
 */

public class This {

	int i = 0;

	This increment() {
		i += 2;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

	public static void main(String args[]) {
		This x = new This();
		x.increment().increment().increment().print();
	}
}

