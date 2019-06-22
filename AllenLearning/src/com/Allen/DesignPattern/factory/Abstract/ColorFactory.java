/**
 * @项目名称：AllenLearning
 * @文件名称：ColorFactory.java
 * @所属包名：com.Allen.DesignPattern.factory.Abstract
 * @创建时间：2019年3月8日下午2:52:51
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */
package com.Allen.DesignPattern.factory.Abstract;

import com.Allen.DesignPattern.factory.Car;


public class ColorFactory extends AbstractFactory {


	@Override
	public Car getCar(String car) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		}
		else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		else {
			System.out.println("这个颜色做不出来");
			return null;
		}
	}



}

