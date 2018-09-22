/**
 * @项目名称：LearnProject
 * @文件名称：Lesson3.java
 * @所属包名：ll.Stream
 * @创建时间：2018年9月7日下午4:17:09
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Stream;

import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import ll.Entity.Dish;

/**
 * @类名称：Lesson3
 * @类描述：stream中各个方法的实际运用
 * @创建人：改成自己名字
 * @创建时间：2018年9月7日 下午4:17:09
 */
public class Lesson3 {

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
		System.out.println("filter 过滤出素食菜品:");
		List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian)// 方法引用检查是否为素食
				.collect(toList());
		vegetarianMenu.forEach(d -> System.out.println(d.getMsg()));
		System.out.println("distinct() 去重:");
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
		System.out.println("截短流：limit(int)函数:");
		menu.stream().filter(d -> d.getCalories() > 300).limit(3)// 截短流
				.collect(toList()).forEach(d -> System.out.println(d.getMsg()));
		System.out.println("跳过元素：skip(int)函数:");
		menu.stream().filter(d -> d.getCalories() > 300).skip(3)// 跳过前3个元素
				.collect(toList()).forEach(d -> System.out.println(d.getMsg()));
		System.out.println("映射：map 流的映射是指对流的每个元素应用一个指定的函数，使其映射成我们需要的新的元素。如从菜单中映射过菜名列表");
		menu.stream().map(Dish::getName)// map映射
				.collect(toList()).forEach(System.out::print);
		System.out.println();
		System.out.println("流的扁平化：flatMap");
		Stream<List<Integer>> inputStream =
				Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
		Stream<Integer> outputStream = inputStream.flatMap((childList) -> childList.stream());
		outputStream.forEach((Integer i) -> System.out.println(i));
		List<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("World");
		// 取得单词流Stream<String> 每个单词为一个字符串
		words.stream()
				// 映射成Stream<String[]>，每个单词转换成了组成该单词的字符数组
				.map(w -> w.split(""))
				// flatMap将每个字符数组转成的字符流Stream<String>扁平化为单个流Stream<String>
				.flatMap(Arrays::stream)
				// 去除重复字符
				.distinct()
				// 获取去重后的字符列表List<String>
				.collect(Collectors.toList()).forEach(s -> System.out.println(s));
		System.out.println("anyMatch:至少匹配一个元素");
		if (menu.stream().anyMatch(Dish::isVegetarian)) {
			System.out.println("找到素食!");
		}
		System.out.println("allMatch:匹配所有元素");
		if (menu.stream().allMatch(d -> d.getCalories() < 1000)) {
			System.out.println("所有菜都是健康的,因为热量都小于1000");
		}
		System.out.println("noneMatch:所有元素都不匹配");
		if (menu.stream().noneMatch(d -> d.getCalories() >= 1000)) {
			System.out.println("所有菜都是健康的,因为热量都不大于1000");
		}
		System.out.println("查找任意元素:findAny 找到任意一个素菜");
		Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian).findAny();
		System.out.println(dish.get());
		System.out.println("查找第一个元素:findFirst()");
		List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> firstSquareDivisibleByThree =
				someNumbers.stream().map(x -> x * x).filter(x -> x % 3 == 0).findFirst(); // 9
		System.out.println(firstSquareDivisibleByThree.get());
		System.out.println();
		// 求最大值
		Optional<Integer> max = numbers.stream().reduce((a, b) -> Integer.max(a, b));
		System.out.println(max.get());
		// 求最小值
		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		System.out.println(min.get());
	}
}

