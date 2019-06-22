package com.Allen.DesignPattern.proxy.jdk;

import java.io.FileOutputStream;
import sun.misc.ProxyGenerator;

public class TestFindLove {
	public static void main(String[] args) {

		try {

			Person obj = (Person) new Meipo().getInstance(new XiaoXingxing());
			System.out.println(obj.getClass());
			obj.findLove();

			// 原理：
			// 1.拿到被代理对象的引用，然后获取它的接口
			// 2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
			// 3.把被代理对象的引用也拿到了
			// 4.重新动态生成一个class字节码
			// 5.然后编译


//			JDK动态代理所用到的代理类在程序调用到代理类对象时才由JVM真正创建，
//			JVM根据传进来的 业务实现类对象 以及 方法名 ，
//			动态地创建了一个代理类的class文件并被字节码引擎执行，
//			然后通过该代理类对象进行方法调用。我们需要做的，只需指定代理类的预处理、调用后操作即可。


			// JDK动态代理的代理对象在创建时，需要使用业务实现类所实现的接口作为参数


			// 获取字节码内容
			byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] {Person.class});
			FileOutputStream os = new FileOutputStream(
					"E:/wj_work_oxygen/AllenLearning/src/com/Allen/DesignPattern/proxy/jdk/$Proxy0.class");
			os.write(data);
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
