/**
 * @项目名称：AllenLearning
 * @文件名称：CarFactory.java
 * @所属包名：com.Allen.DesignPattern.factory.Abstract
 * @创建时间：2019年3月8日下午2:55:49
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */
package com.Allen.DesignPattern.factory.Abstract;

import com.Allen.DesignPattern.factory.Audi;
import com.Allen.DesignPattern.factory.Benz;
import com.Allen.DesignPattern.factory.Bmw;
import com.Allen.DesignPattern.factory.Car;

/**
 * @类名称：CarFactory
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2019年3月8日 下午2:55:49
 */
public class CarFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Car getCar(String name) {
		if ("BMW".equalsIgnoreCase(name)) {
			return new Bmw();
		}
		else if ("Benz".equalsIgnoreCase(name)) {
			return new Benz();
		}
		else if ("Audi".equalsIgnoreCase(name)) {
			return new Audi();
		}
		else {
			System.out.println("这个汽车做不出来");
			return null;
		}
	}

}

