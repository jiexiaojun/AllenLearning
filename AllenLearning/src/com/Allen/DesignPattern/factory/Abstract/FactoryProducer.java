/**
 * @项目名称：AllenLearning
 * @文件名称：FactoryProducer.java
 * @所属包名：com.Allen.DesignPattern.factory.Abstract
 * @创建时间：2019年3月8日下午2:58:40
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */
package com.Allen.DesignPattern.factory.Abstract;

/**
 * @类名称：FactoryProducer
 * @类描述：创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * @创建人：改成自己名字
 * @创建时间：2019年3月8日 下午2:58:40
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("CAR")) {
			return new CarFactory();
		}
		else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}

