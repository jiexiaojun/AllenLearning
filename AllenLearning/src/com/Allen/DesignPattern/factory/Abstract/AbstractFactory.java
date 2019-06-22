package com.Allen.DesignPattern.factory.Abstract;

import com.Allen.DesignPattern.factory.Car;

public abstract class AbstractFactory {

	public abstract Color getColor(String color);

	public abstract Car getCar(String car);

}
