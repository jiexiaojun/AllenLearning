/**
 * @项目名称：LearnProject
 * @文件名称：OverridableImpl.java
 * @所属包名：ll.Interface
 * @创建时间：2018年9月14日上午8:38:50
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Interface;

/**
 * @类名称：OverridableImpl
 * @类描述：OverridableImpl类也实现了这个接口，但覆写了该接口的默认方法，并提供了一个不同的实现
 * @创建人：改成自己名字
 * @创建时间：2018年9月14日 上午8:38:50
 */
public class OverridableImpl implements Defaulable {

	public String getString(String s) {

		return s + "一个类实现接口，必须实现他的所有方法 ，但不包括默认方法";
	}

	@Override
	public String notRequired() {
		return "Overridden implementation";
	}

	public static void main(String[] args) {
		OverridableImpl ll = new OverridableImpl();

		System.out.println(ll.getString(""));

		// 覆写了该接口的默认方法，并提供了一个不同的实现
		System.out.println(ll.notRequired());
	}
}

