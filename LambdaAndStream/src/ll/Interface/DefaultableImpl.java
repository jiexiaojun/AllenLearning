/**
 * @项目名称：LearnProject
 * @文件名称：DefaultableImpl.java
 * @所属包名：ll.Interface
 * @创建时间：2018年9月14日上午8:35:52
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Interface;

/**
 * @类名称：DefaultableImpl
 * @类描述：DefaultableImpl类实现了这个接口，同时默认继承了这个接口中的默认方法
 * @创建人：改成自己名字
 * @创建时间：2018年9月14日 上午8:35:52
 */
public class DefaultableImpl implements Defaulable {


	public String getString(String s) {

		return s + "一个类实现接口，必须实现他的所有方法 ，但不包括默认方法";
	}

	public static void main(String[] args) {
		DefaultableImpl ll = new DefaultableImpl();

		System.out.println(ll.getString(""));

		// 默认继承了这个接口中的默认方法
		System.out.println(ll.notRequired());
	}
}

