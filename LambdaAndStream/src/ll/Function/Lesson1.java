/**
 * @项目名称：LearnProject
 * @文件名称：Lesson1.java
 * @所属包名：ll.Function
 * @创建时间：2018年9月5日下午4:26:28
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Function;

import java.util.ArrayList;
import java.util.List;
import ll.Entity.Apple;

/**
 * @类名称：Lesson1
 * @类描述：按照客户需求，过滤出客户需要的产品。每当需求变化，就得重新写方法。不是很完美。而且代码重复率很高。
 * @创建人：jie.xiaojun
 * @创建时间：2018年9月5日 下午4:26:28
 */
public class Lesson1 {

	static List<Apple> appleList = new ArrayList<Apple>() {
		/**
		 * @变量用途：TODO
		 */
		private static final long serialVersionUID = 3918702620267943370L;
		{
			add(new Apple("green", 50));
			add(new Apple("green", 100));
			add(new Apple("green", 200));
			add(new Apple("red", 50));
			add(new Apple("red", 100));
			add(new Apple("red", 200));
			add(new Apple("yellow", 50));
			add(new Apple("yellow", 100));
			add(new Apple("yellow", 150));
			add(new Apple("yellow", 200));
		}
	};


	/**
	*过滤出绿色苹果
	*/
	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			// 颜色等于green则加入筛选结果中
			if ("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}

	/**
	*过滤出符合参数条件的苹果
	*/
	public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (apple.getColor().equals(color)) {
				result.add(apple);
			}
		}
		return result;
	}

	/**
	*过滤出重量大于150g的苹果
	*/
	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			// 重量是否大于150g则加入筛选结果中
			if (apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		return result;
	}

	/**
	*过滤出重量大于参数的苹果
	*/
	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}

	/**
	*颜色与重量合并过滤
	*/
	public static List<Apple> filterApples(List<Apple> inventory, String color, int weight) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple : inventory) {
			// flag标志用于区分是颜色筛选还是重量筛选
			if (apple.getColor().equals(color) && apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("开始打印绿苹果：");
		List<Apple> a = filterGreenApples(appleList);
		a.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));
		System.out.println("开始打印重量大于150的苹果：");
		List<Apple> b = filterHeavyApples(appleList);
		b.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));
		System.out.println("开始打印红苹果：");
		filterApplesByColor(appleList, "red")
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));
		System.out.println("开始打印重量大于100的苹果：");
		filterApplesByWeight(appleList, 100)
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));
		System.out.println("开始打印重量大于100的黄苹果：");
		filterApples(appleList, "yellow", 100)
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));
	}
}

