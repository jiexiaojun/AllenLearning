/**
 * @项目名称：LearnProject
 * @文件名称：Defaulable.java
 * @所属包名：ll.Interface
 * @创建时间：2018年9月14日上午8:34:54
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Interface;

/**
 * @类名称：Defaulable
 * @类描述：接口
 * @创建人：jie.xiaojun
 * @创建时间：2018年9月14日 上午8:34:54
 */
public interface Defaulable {

	/**
	 * 
	 * @方法描述：Defaulable接口使用关键字default定义了一个默认方法notRequired()
	 * @创建人：
	 * @创建时间：2018年9月14日 上午8:35:15
	 * @修改人：
	 * @修改时间：2018年9月14日 上午8:35:15
	 * @修改内容：
	 * @return	
	 * @version 1.0
	 */
	default String notRequired() {
		return "我是接口的默认方法";
	}

	/**
	 * 
	 * @方法描述：接口的普通方法
	 * @创建人：
	 * @创建时间：2018年9月14日 上午8:36:54
	 * @修改人：
	 * @修改时间：2018年9月14日 上午8:36:54
	 * @修改内容：
	 * @param s
	 * @return	
	 * @version 1.0
	 */
	public String getString(String s);
}

