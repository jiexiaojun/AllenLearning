/**
 * @项目名称：LearnProject
 * @文件名称：DefaulableFactoryImpl.java
 * @所属包名：ll.Interface
 * @创建时间：2018年9月14日上午8:50:09
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Interface;

/**
 * @类名称：DefaulableFactoryImpl
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月14日 上午8:50:09
 */
public class DefaulableFactoryImpl {


	public static void main(String[] args) {
		Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
		System.out.println(defaulable.notRequired());

		defaulable = DefaulableFactory.create(OverridableImpl::new);
		System.out.println(defaulable.notRequired());
	}
}

