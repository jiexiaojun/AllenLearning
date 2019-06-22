/**
 * @项目名称：LearnProject
 * @文件名称：Lesson2.java
 * @所属包名：ll.Function
 * @创建时间：2018年9月5日下午4:38:37
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Function;


import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.List;
import ll.Entity.Apple;

/**
 * @类名称：Lesson2
 * @类描述：使用lambda表达式  替换掉 匿名内部类的写法使代码更简洁
 * @创建人：jie.xiaojun
 * @创建时间：2018年9月5日 下午4:38:37
 */
public class Lesson3 {

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
	*java8里的谓词，在此列出是为了看得更清晰，可能从java.util.function包中直接导入
	*/
	public interface Predicate<T> {
		boolean test(T t);
	}

	/**
	*通用的过滤方法 这里只能过滤苹果类
	*@param inventory
	*@param p 方法作为Predicate参数p传递进去
	*/
	static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			// 苹果符合p的条件即加入筛选结果中
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	/**
	*通用的过滤方法  这里使用泛型
	*@param inventory
	*@param p 方法作为Predicate参数p传递进去
	*/
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}


	public static void main(String[] args) {
		System.out.println("开始打印绿苹果");
		filterApples(appleList, (Apple a) -> "green".equals(a.getColor()))
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));

		System.out.println("开始打印重量大于150的苹果");
		filterApples(appleList, (Apple a) -> a.getWeight() > 150)
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));


		System.out.println("开始打印重量大于150的绿苹果");
		List<Apple> lista = filterApples(appleList, (Apple a) -> "green".equals(a.getColor()));

		List<Apple> listc = filterApples(lista, (Apple a) -> a.getWeight() > 150);
		listc.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));

		System.out.println("开始打印重量大于150的绿苹果");
		filterApples(appleList, (Apple a) -> "green".equals(a.getColor()) && a.getWeight() > 150)
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));

		System.out.println("开始打印绿苹果 使用泛型的过滤方法");
		filter(appleList, (Apple a) -> "green".equals(a.getColor()))
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));

		appleList.parallelStream().filter((Apple a) -> a.getWeight() > 150).collect(toList())
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));

		System.out.println("开始打印出偶数");
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		filter(numbers, (Integer i) -> i % 2 == 0).forEach((p) -> System.out.println(p));


	}
}

