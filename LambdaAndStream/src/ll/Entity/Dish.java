/**
 * @项目名称：LearnProject
 * @文件名称：Dish.java
 * @所属包名：ll.Entity
 * @创建时间：2018年9月7日下午3:22:43
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Entity;

/**
 * @类名称：Dish
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月7日 下午3:22:43
 */
public class Dish {
	private final String name;// 菜名
	private final boolean vegetarian;// 素食标志
	private final int calories;// 热量
	private final Type type;// 类型

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return name;
	}


	public String getMsg() {
		return name + ":" + calories;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}
}

