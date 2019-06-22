/**
 * @项目名称：AllenLearning
 * @文件名称：Singleton5.java
 * @所属包名：com.Allen.DesignPattern.singleton.other
 * @创建时间：2019年3月8日下午3:32:41
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */
package com.Allen.DesignPattern.singleton.other;

//饿汉式单例类.在类初始化时，已经自行实例化   
public class Singleton5 {
//1、 同样也是将默认构造方法私有化
	private Singleton5() {}

//2、声明静态变量，在类实例化之前就初始化变量,将对象引用保存
	private static final Singleton5 single = new Singleton5();

//3、开放静态方法，获取实例
	public static Singleton5 getInstance() {
		return single;
	}

	// 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
}
