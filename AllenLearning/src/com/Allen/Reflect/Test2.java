/**
 * @项目名称：testClass
 * @文件名称：Test2.java
 * @所属包名：lcy.reflect
 * @创建时间：2018年9月20日下午3:14:39
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */

package com.Allen.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @类名称：Test2
 * @类描述：测试类 通过反射机制调用测试类Test1的私有属性
 * @创建人：jie.xiaojun
 * @创建时间：2018年9月20日 下午3:14:39
 */

public class Test2 {

	public static void main(String[] args) throws Exception {

		Test1 test = new Test1();
		// 访问类的非私有属性
		System.out.println(test.publicString);
		System.out.println(test.getpublicString("打印"));

		// 访问类的私有变量
		Field field = Test1.class.getDeclaredField("privateString");
//		Field field = Class.forName("com.Allen.Reflect.Test1").getDeclaredField("privateString");
		field.setAccessible(true);// 允许访问私有字段
		String fieldValue = (String) field.get(test);// 获得私有字段值
		System.out.println(fieldValue);


		// 访问类的私有方法
		Method method =
				Test1.class.getDeclaredMethod("getprivateString", new Class[] {String.class});
		method.setAccessible(true);
		String result = (String) method.invoke(test, "打印");
		System.out.println(result);

		// 访问类的私有方法
		Method method1 = Class.forName("com.Allen.Reflect.Test1").getDeclaredMethod("moreparms",
				new Class[] {String.class, Integer.class});
		method1.setAccessible(true);
		String result1 = (String) method1.invoke(test, "打印", 2);
		System.out.println(result1);
	}
}
