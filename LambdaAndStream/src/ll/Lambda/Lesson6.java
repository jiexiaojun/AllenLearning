/**
 * @项目名称：LearnProject
 * @文件名称：Lesson6.java
 * @所属包名：ll.Lambda
 * @创建时间：2018年9月7日上午11:18:05
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @类名称：Lesson6
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月7日 上午11:18:05
 */
public class Lesson6 {

	// 定义函数式接口来传递处理文件的行为
	@FunctionalInterface
	public interface BufferedReaderProcessor {
		String process(BufferedReader b) throws IOException;
	}

	/**
	 * 实现接口 读第一行 内部类
	 */
	public class RedOne implements BufferedReaderProcessor {
		@Override
		public String process(BufferedReader b) throws IOException {
			return b.readLine();
		}

	}

	/**
	 * 实现接口 读前两行 内部类
	 */
	public class RedTwo implements BufferedReaderProcessor {
		@Override
		public String process(BufferedReader b) throws IOException {
			return b.readLine() + b.readLine();
		}

	}

	// 定义处理文件的方法（环绕执行模式）
	public static String processFile(BufferedReaderProcessor p) throws IOException {
		try (BufferedReader br =
				new BufferedReader(new FileReader("C:\\Users\\lanston\\Desktop\\data.txt"))) {
			return p.process(br);
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("传递声明的内部类: 读取一行  麻烦之处就是要声明实现类");
		System.out.println(processFile(new Lesson6().new RedOne()));
		System.out.println("传递匿名内部类：读取一行 麻烦之处就是代码繁冗，无用代码好几行");
		System.out.println(processFile(new BufferedReaderProcessor() {
			@Override
			public String process(BufferedReader b) throws IOException {
				return b.readLine();
			}
		}));
		System.out.println("传递Lambda：读取一行 代码简洁明了");
		String oneLine = processFile((BufferedReader br) -> br.readLine());
		System.out.println(oneLine);
		System.out.println("传递Lambda：读取两行");
		String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());
		System.out.println(twoLines);
	}

}

