/**
 * @项目名称：LearnProject
 * @文件名称：Lesson2.java
 * @所属包名：ll.Lambda
 * @创建时间：2018年9月5日上午10:06:18
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @类名称：Lesson2
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月5日 上午10:06:18
 */
public class Lesson2 {

	/**
	 * @方法描述：TODO
	 * @创建人：
	 * @创建时间：2018年9月5日 上午10:06:18
	 * @修改人：
	 * @修改时间：2018年9月5日 上午10:06:18
	 * @修改内容：
	 * @param args	
	 * @version 1.0 
	 */
	public static void main(String[] args) {

		String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer",
				"Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
		List<String> players = Arrays.asList(atp);

		// 以前的循环方式
		for (String player : players) {
			System.out.print(player + "; ");
		}
		System.out.println("************************");
		// 使用 lambda 表达式以及函数操作(functional operation)
		players.forEach((player) -> System.out.print(player + "; "));

		System.out.println("************************");
		// 在 Java 8 中使用双冒号操作符(double colon operator)
		players.forEach(System.out::print);

		System.out.println("************************");
	}

}

