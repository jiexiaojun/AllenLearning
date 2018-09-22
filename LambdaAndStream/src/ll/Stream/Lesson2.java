/**
 * @项目名称：LearnProject
 * @文件名称：Lesson2.java
 * @所属包名：ll.Stream
 * @创建时间：2018年9月7日下午3:21:05
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ll.Entity.Dish;

/**
 * @类名称：Lesson2
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月7日 下午3:21:05
 */
public class Lesson2 {

	static List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT),
			new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER),
			new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER),
			new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 300, Dish.Type.FISH),
			new Dish("salmon", false, 450, Dish.Type.FISH));



	public static void main(String[] args) {
		// 装热量低的菜的集合
		List<Dish> lowCaloricDishes = new ArrayList<>();
		// 遍历菜单，筛选出热量低的菜
		for (Dish d : menu) {
			if (d.getCalories() < 400) {
				lowCaloricDishes.add(d);
			}
		}
		// 对低热量菜按热量由低到高排序
		Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
			public int compare(Dish d1, Dish d2) {
				return Integer.compare(d1.getCalories(), d2.getCalories());
			}
		});
		// 低热量菜名集合
		List<String> lowCaloricDishesName = new ArrayList<String>();
		// 遍历出低热量菜名
		for (Dish d : lowCaloricDishes) {
			lowCaloricDishesName.add(d.getName() + ":" + d.getCalories());
		}
		lowCaloricDishesName.forEach((String s) -> System.out.println(s));
		System.out.println("上面的代码需要我们实现每一个细节：遍历了两次、用了一个匿名类，且有一个垃圾变量lowCaloricDishes（它仅被用作一次性能蹭变量）");
		System.out.println("*********************************");

		// 从集合中获取流
		List<String> lowCaloricDishesNameNew = menu.parallelStream()
				// 筛选低热量菜 d -> d.getCalories() < 400等价于(Dish d) -> d.getCalories() < 400
				.filter(d -> d.getCalories() < 400)
				// 根据热量排序Dish::getCalories 等价于(Dish d) -> d.getCalories()
				.sorted(comparing(Dish::getCalories))
				// 获取菜名价格
				.map(Dish::getMsg)
				// 生成结果：低热量菜名集合
				.collect(toList());
		lowCaloricDishesNameNew.forEach((String s) -> System.out.println(s));
	}
}

