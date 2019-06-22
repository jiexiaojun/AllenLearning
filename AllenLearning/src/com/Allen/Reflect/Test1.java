/**
 * @项目名称：testClass
 * @文件名称：Test1.java
 * @所属包名：lcy.reflect
 * @创建时间：2018年9月20日下午3:14:26
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */

package com.Allen.Reflect;

/**
 * @类名称：Test1
 * @类描述：测试类，有私有方法和私有变量 通过反射机制调用其私有属性
 * @创建人：jie.xiaojun
 * @创建时间：2018年9月20日 下午3:14:26
 */
@SuppressWarnings("unused")
public class Test1 {

	private String privateString = "我是类Test1的私有变量";


	public String publicString = "我是类Test1的非私有变量";


	private String getprivateString(String s) {
		return s + "我是类Test1的私有方法getprivateString(String s)";
	}

	private String moreparms(String s, Integer a) {
		return s + "我是类Test1的私有方法moreparms(String s,Integer a)";
	}

	public String getpublicString(String s) {
		return s + "我是类Test1的非私有方法getpublicString(String s)";
	}

}
