package com.Allen.DesignPattern.factory.more;

import com.Allen.DesignPattern.factory.Bmw;
import com.Allen.DesignPattern.factory.Car;

public class BmwFactory implements Factory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
