package com.Allen.DesignPattern.factory.more;

import com.Allen.DesignPattern.factory.Audi;
import com.Allen.DesignPattern.factory.Car;

public class AudiFactory implements Factory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
