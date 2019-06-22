package com.Allen.DesignPattern.Template;

public class Coffee extends Bevegrage {

	// 原材料放到杯中
	public void pourInCup() {
		System.out.println("将咖啡倒入杯中");
	}

	// 放辅料
	public void addCoundiments() {
		System.out.println("添加牛奶和糖");
	}

}
