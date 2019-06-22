/**
 * @项目名称：LearnProject
 * @文件名称：Lesson2.java
 * @所属包名：ll.Function
 * @创建时间：2018年9月5日下午4:38:37
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Function;


import java.util.ArrayList;
import java.util.List;
import ll.Entity.Apple;

/**
 * @类名称：Lesson2
 * @类描述：这样针对不同的过滤需求（行为），我们只需要定义不同的ApplePredicate的实现类
 * 无论筛选需求的组合多么复杂，都只有一个行为参数，至此，filterApples方法已经能够应对不断变化的筛选需求了。
 * 但每一个筛选行为都需要定义一个类，是不是太啰嗦了？
 * @创建人：jie.xiaojun
 * @创建时间：2018年9月5日 下午4:38:37
 */
public class Lesson2 {

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
	/**
	*对筛选标准建立模型
	*/
	public interface ApplePredicate {
		// test方法决定了apple是否满足我们的筛选条件
		boolean test(Apple apple);
	}


	/**
	*代表了选出较重苹果的这一行为 内部类
	*/
	public class AppleHeavyWeightPredicate implements ApplePredicate {
		public boolean test(Apple apple) {
			return apple.getWeight() > 150;
		}
	}
	/**
	*代表了选出绿色苹果这一行为 内部类
	*/
	public class AppleGreenColorPredicate implements ApplePredicate {
		public boolean test(Apple apple) {
			return "green".equals(apple.getColor());
		}
	}


	/**
	*代表了选出红色并且较重的苹果 内部类
	*/
	public class AppleRedAndHeavyPredicate implements ApplePredicate {
		public boolean test(Apple apple) {
			return "red".equals(apple.getColor()) && apple.getWeight() > 150;
		}
	}


	/**
	*通用的过滤方法
	*@param inventory
	*@param p 方法作为Predicate参数p传递进去
	*/
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			// ApplePredicate对象封装了测试苹果的条件
			// 满足条件即是我们需要选出的结果
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}



	public static void main(String[] args) {
		System.out.println("开始打印重量大于150的苹果");
		filterApples(appleList, new Lesson2().new AppleHeavyWeightPredicate())
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));

		System.out.println("开始打印绿苹果");
		filterApples(appleList, new Lesson2().new AppleGreenColorPredicate())
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));

		System.out.println("开始打印重量大于150的红苹果");
		filterApples(appleList, new Lesson2().new AppleRedAndHeavyPredicate())
				.forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));

		System.out.println("下面是匿名内部类：");
		System.out.println("匿名内部类的好处就是不用像上面那样声明那么多内部类，使用匿名类省去这些类的声明");
		System.out.println("开始打印红苹果");
		filterApples(appleList, new ApplePredicate() {
			public boolean test(Apple apple) {
				return "red".equals(apple.getColor());
			}
		}).forEach((p) -> System.out.println(p.getColor() + " " + p.getWeight()));
	}
}

