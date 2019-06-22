package com.Allen.DesignPattern.factory.Abstract;

import com.Allen.DesignPattern.factory.Car;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		// 获取车品牌
		AbstractFactory CarFactory = FactoryProducer.getFactory("CAR");

		// 获取奥迪车
		Car car1 = CarFactory.getCar("AUDI");

		// 调用 奥迪的getName方法
		System.out.println(car1.getName());

		// 获取宝马车
		Car car2 = CarFactory.getCar("bmw");

		// 调用 宝马的getName方法
		System.out.println(car2.getName());

		// 获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		// 获取颜色为 Red 的对象
		Color color1 = colorFactory.getColor("RED");

		// 调用 Red 的 fill 方法
		System.out.println(color1.getColor());

		// 获取颜色为 Green 的对象
		Color color2 = colorFactory.getColor("Green");

		// 调用 Green 的 fill 方法
		System.out.println(color2.getColor());

		// 获取颜色为 Blue 的对象
		Color color3 = colorFactory.getColor("BLUE");

		// 调用 Blue 的 fill 方法
		System.out.println(color3.getColor());

	}
}
