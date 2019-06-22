package com.Allen.DesignPattern.factory.more;

import com.Allen.DesignPattern.factory.Benz;
import com.Allen.DesignPattern.factory.Car;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
