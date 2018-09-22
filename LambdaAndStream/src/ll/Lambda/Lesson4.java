/**
 * @项目名称：LearnProject
 * @文件名称：Lesson4.java
 * @所属包名：ll.Lambda
 * @创建时间：2018年9月5日下午2:18:16
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import ll.Entity.Person;

/**
 * @类名称：Lesson4
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月5日 下午2:18:16
 */
public class Lesson4 {

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


	public static void main(String[] args) {
		System.out.println("开始打印所有java程序员的姓名1:");
		javaProgrammers
				.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));
		System.out.println();
		System.out.println("开始打印所有java程序员的姓名2:");
		javaProgrammers
				.forEach((p) -> System.out.println(p.getFirstName() + " " + p.getLastName() + ";"));
		System.out.println("开始打印所有php程序员的姓名:");
		phpProgrammers
				.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));


		System.out.println("开始打印加工资前php程序员的工资");
		for (Person p : phpProgrammers) {
			System.out.println(p.getSalary());
		}
		System.out.println("给程序员加薪 5% :");
		Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());
		javaProgrammers.forEach(giveRaise);
		phpProgrammers.forEach(giveRaise);
		System.out.println("开始打印加工资后php程序员的工资");
		for (Person p : phpProgrammers) {
			System.out.println(p.getSalary());
		}


	}
}

