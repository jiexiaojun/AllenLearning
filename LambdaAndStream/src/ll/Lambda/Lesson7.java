/**
 * @项目名称：LearnProject
 * @文件名称：Lesson7.java
 * @所属包名：ll.Lambda
 * @创建时间：2018年9月7日上午11:35:26
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @类名称：Lesson7
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月7日 上午11:35:26
 */
public class Lesson7 {


	// ******************begin***********************
	@FunctionalInterface
	public interface Predicate<T> {
		boolean test(T t);
	}

	// 根据条件（行为）p过滤集合，符合条件p的加入过滤结果中
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for (T s : list) {
			if (p.test(s)) {
				results.add(s);
			}
		}
		return results;
	}
	// ******************end***********************

	// ******************begin***********************
	@FunctionalInterface
	public interface Consumer<T> {
		void accept(T t);
	}

	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for (T i : list) {
			c.accept(i);
		}
	}
	// ******************end***********************


	// ******************begin***********************
	@FunctionalInterface
	public interface Function<T, R> {
		R apply(T t);
	}

	public class ppp implements Function<String, Integer> {
		/**
		 * TODO 简单描述该方法的实现功能（可选）.
		 * @see ll.Lambda.Lesson7.Function#apply(java.lang.Object)
		 */
		@Override
		public Integer apply(String t) {

			return t.length();
		}

	}

	// 抽象方法apply是将泛型参数对象T转换成了泛型R对象,常用于将输入信息映射成另一种类型的输出
	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for (T s : list) {
			result.add(f.apply(s));
		}
		return result;
	}
	// ******************end***********************

	public static void main(String[] args) {
		// Lambda表达式，判断非空
		Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("1");
		listOfStrings.add("");
		listOfStrings.add("2");
		// 从集合中过滤出非空的字符串
		List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
		nonEmpty.forEach((String s) -> System.out.println(s));

		forEach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
		System.out.println("这里传递给forEach方法的第二个参数：Lambda表达式，就相当于实现了函数式接口Consumer中抽象方法accept");



		// 将输入的字符串集合映射成字符串长度的整形集合
		List<Integer> l = map(Arrays.asList("lambdas", "in", "action"), (String s) -> s.length());
		l.forEach((Integer i) -> System.out.println(i));
		System.out.println("同样，上面代码传递给map方法的第二个参数：lambda表达式，是Function方法apply的实现。");
		List<Integer> m = map(Arrays.asList("lambdas", "in", "action"), new Lesson7().new ppp());
		m.forEach((Integer i) -> System.out.println(i));

	}

}

