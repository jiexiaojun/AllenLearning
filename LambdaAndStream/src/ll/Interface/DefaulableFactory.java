/**
 * @项目名称：LearnProject
 * @文件名称：DefaulableFactory.java
 * @所属包名：ll.Interface
 * @创建时间：2018年9月14日上午8:47:37
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Interface;

import java.util.function.Supplier;

/**
 * @类名称：DefaulableFactory
 * @类描述：接口中可以定义静态方法  还可以有方法体
 * @创建人：改成自己名字
 * @创建时间：2018年9月14日 上午8:47:37
 */
public interface DefaulableFactory {

	// Interfaces now allow static methods
	static Defaulable create(Supplier<Defaulable> supplier) {
		return supplier.get();
	}
}

