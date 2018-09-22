/**
 * @项目名称：LearnProject
 * @文件名称：Lesson1.java
 * @所属包名：ll.Stream
 * @创建时间：2018年9月7日下午2:30:17
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import ll.Entity.Person;

/**
 * @类名称：Lesson1
 * @类描述：学习stream
 * @创建人：jie.xiaojun
 * @创建时间：2018年9月7日 下午2:30:17
 */
public class Lesson1 {
	static List<Person> javaProgrammers = new ArrayList<Person>() {
		/**
		 * @变量用途：TODO
		 */
		private static final long serialVersionUID = 3918702620267943370L;

		{
			add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
			add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
			add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
			add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
			add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
			add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
			add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
			add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
			add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
			add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
		}
	};

	static List<Person> phpProgrammers = new ArrayList<Person>() {
		/**
		 * @变量用途：TODO
		 */
		private static final long serialVersionUID = 2470698954696862714L;

		{
			add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
			add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
			add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
			add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
			add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
			add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
			add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
			add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
			add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
			add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
		}
	};

	// 自定义 filters
	static Predicate<Person> ageFilter = (p) -> (p.getAge() > 24);
	static Predicate<Person> salaryFilter = (p) -> (p.getSalary() > 1400);
	static Predicate<Person> genderFilter = (p) -> ("female".equals(p.getGender()));

	public static void main(String[] args) {
		System.out.println("开始打印月薪超过 $1,400 的PHP程序员:");
		phpProgrammers.stream().filter((p) -> p.getSalary() > 1400).forEach((p) -> System.out
				.printf("%s %s %s %n", p.getFirstName(), p.getLastName(), p.getGender()));

		System.out.println("开始打印年龄大于 24岁且月薪在$1,400以上的女PHP程序员:");
		phpProgrammers.stream().filter(ageFilter).filter(salaryFilter).filter(genderFilter)
				.forEach((p) -> System.out.printf("%s %s %s; %n", p.getFirstName(), p.getLastName(),
						p.getGender()));


		// 重用filters
		System.out.println("开始打印年龄大于 24岁的女性 java程序员：");
		javaProgrammers.stream().filter(ageFilter).filter(genderFilter).forEach((p) -> System.out
				.printf("%s %s %s; %n", p.getFirstName(), p.getLastName(), p.getGender()));

		System.out.println("开始打印最前面的3个java程序员：");
		javaProgrammers.stream().limit(3).forEach((p) -> System.out.printf("%s %s %s; %n",
				p.getFirstName(), p.getLastName(), p.getGender()));


		System.out.println("开始打印最前面的3个女性 java程序员");
		javaProgrammers.stream().filter(genderFilter).limit(3).forEach((p) -> System.out
				.printf("%s %s %s; %n", p.getFirstName(), p.getLastName(), p.getGender()));

		System.out.println("根据 name排序,并显示前5个 Java programmers:");
		javaProgrammers.stream()
				.sorted((p1, p2) -> (p1.getFirstName().compareTo(p2.getFirstName()))).limit(5)
				.collect(toList())
				.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));

		System.out.println("根据 salary 排序 Java programmers:");
		javaProgrammers.stream().sorted((p1, p2) -> (p1.getSalary() - p2.getSalary()))
				.collect(toList()).forEach((p) -> System.out.printf("%s %s $%,d; %n",
						p.getFirstName(), p.getLastName(), p.getSalary()));

		System.out.println("工资最低的 Java programmer:");
		Person pers =
				javaProgrammers.stream().min((p1, p2) -> (p1.getSalary() - p2.getSalary())).get();
		System.out.printf("Name: %s %s; Salary: $%,d;%n", pers.getFirstName(), pers.getLastName(),
				pers.getSalary());

		System.out.println("工资最高的 Java programmer:");
		Person person =
				javaProgrammers.stream().max((p1, p2) -> (p1.getSalary() - p2.getSalary())).get();
		System.out.printf("Name: %s %s; Salary: $%,d;%n", person.getFirstName(),
				person.getLastName(), person.getSalary());

		System.out.println("将 PHP programmers 的 first name 拼接成字符串:");
		String phpDevelopers =
				phpProgrammers.stream().map(Person::getFirstName).collect(joining(";")); // 在进一步的操作中可以作为标记(token)
		System.out.println(phpDevelopers);
		// Person::getFirstName等价于(Person p) -> p.getFirstName()
		System.out.println(
				phpProgrammers.stream().map((Person p) -> p.getFirstName()).collect(joining(";")));

		System.out.println("将 Java programmers 的 first name 存放到 Set:");
		Set<String> javaDevFirstName =
				javaProgrammers.stream().map(Person::getFirstName).collect(toSet());
		javaDevFirstName.forEach((String s) -> System.out.println(s));

		System.out.println("将 Java programmers 的 last name 存放到 TreeSet:");
		TreeSet<String> javaDevLastName = javaProgrammers.stream().map(Person::getLastName)
				.collect(toCollection(TreeSet::new));
		javaDevLastName.forEach(System.out::println);


		System.out.println("打印出计算付给 Java programmers 的所有money:");
		int totalSalary = javaProgrammers.parallelStream().mapToInt(p -> p.getSalary()).sum();
		System.out.println(totalSalary);

		// 我们可以使用summaryStatistics方法获得stream 中元素的各种汇总数据。 接下来,我们可以访问这些方法,比如getMax, getMin,
		// getSum或getAverage:
		// 计算 count, min, max, sum, and average for numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("List中最大的数字 : " + stats.getMax());
		System.out.println("List中最小的数字 : " + stats.getMin());
		System.out.println("所有数字的总和   : " + stats.getSum());
		System.out.println("所有数字的平均值 : " + stats.getAverage());

	}
}

