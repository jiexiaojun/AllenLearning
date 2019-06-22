/**
 * @项目名称：testClass
 * @文件名称：MySingleton.java
 * @所属包名：allen._51_60
 * @创建时间：2019年2月21日上午10:44:58
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */ 

package allen._51_60;


/**
 * @类名称：MySingleton
 * @类描述：TODO
 * @创建人：jie.xiaojun
 * @创建时间：2019年2月21日 上午10:44:58
 */

public class MySingleton {
	
	//私有静态内部类
	private static class innerSingleton{
		private static final MySingleton  instence= new MySingleton();
	}
	
	//私有的构造函数
	private  MySingleton() {};
	
	
	public static final MySingleton getInstence() {
		return innerSingleton.instence;
	}
	
	
}

