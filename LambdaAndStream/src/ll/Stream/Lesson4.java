/**
 * @项目名称：LearnProject
 * @文件名称：Lesson4.java
 * @所属包名：ll.Stream
 * @创建时间：2018年9月7日下午5:09:04
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Stream;

import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import ll.Entity.Dish;

/**
 * @类名称：Lesson4
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月7日 下午5:09:04
 */
@SuppressWarnings("unused")
public class Lesson4 {

	// 一个 Stream 只可以使用一次，上面的代码为了简洁而重复使用了数次。
	public static void main(String[] args) {
		System.out.println("初始化字符串流三种方式：");
		System.out.println("1. Individual values");
		Stream<String> stream1 = Stream.of("Java 8", "Lambdas", "In", "Action");
		System.out.println("2. Arrays");
		String[] strArray = new String[] {"a", "b", "c"};
		Stream<String> stream2_1 = Stream.of(strArray);
		Stream<String> stream2_2 = Arrays.stream(strArray);
		System.out.println("3. Collections");
		Stream<String> stream3 = Arrays.asList(strArray).stream();
		System.out.println("*****************************");

		System.out.println("将字符串流转化为List<String>  还可以 toSet toCollection等");
		List<String> list = stream1.collect(toList());
		System.out.println("初始化一个List<String>");
		List<String> listA = new ArrayList<String>();
		listA.add("1");
		listA.add("2");
		listA.add("3");
		System.out.println("将List<String>转化为字符串流");
		Stream<String> streamA = listA.stream();
		System.out.println("之所以要转化是因为要利用字符串流中的一些方法 比如下面的filter");

		List<String> listB = streamA.filter(s -> s.equals("2")).collect(toList());
		listB.forEach(s -> System.out.println(s));
		System.out.println("*****************************");
		System.out.println("目前有三种对应的包装类型 Stream：");
		System.out.println("IntStream、LongStream、DoubleStream。"
				+ "当然我们也可以用 Stream<Integer>、Stream<Long> >、Stream<Double>"
				+ "但是 boxing 和 unboxing 会很耗时，所以特别为这三种基本数值型提供了对应的 Stream。");
		System.out.println("普通流转换为数值流");
		IntStream intStream = Lesson3.menu.stream().mapToInt(Dish::getCalories);
		OptionalInt max = intStream.reduce((a, b) -> Integer.max(a, b));
		System.out.println(max.getAsInt());


		IntStream intStreamA = Lesson3.menu.stream().mapToInt(Dish::getCalories);
		Stream<Integer> streamC = intStreamA.boxed();
		Optional<Integer> sum = streamC.max((a, b) -> Integer.max(a, b));
		System.out.println(sum.get());


		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(33);

		IntStream intStreamB = listInteger.stream().mapToInt(Integer::valueOf);
		OptionalInt aInt = intStreamB.max();
		System.out.println(aInt.getAsInt());


		IntStream intStreamC = listInteger.stream().mapToInt(Integer::valueOf);
		Stream<Integer> stream2 = intStreamC.boxed();
		Optional<Integer> maxint = stream2.max((a, b) -> Integer.max(a, b));
	}

}

