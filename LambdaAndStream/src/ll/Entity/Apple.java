/**
 * @项目名称：LearnProject
 * @文件名称：Apple.java
 * @所属包名：ll.Entity
 * @创建时间：2018年9月5日下午4:23:51
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */
package ll.Entity;

/**
 * @类名称：Apple
 * @类描述：TODO
 * @创建人：改成自己名字
 * @创建时间：2018年9月5日 下午4:23:51
 */
public class Apple {
	private String color;
	private int weight;

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	/**
	 * color.
	 *
	 * @return  the color
	 * @since   JDK 1.6
	 */
	public String getColor() {
		return color;
	}

	/**
	 * color.
	 *
	 * @param   color    the color to set
	 * @since   JDK 1.6
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * weight.
	 *
	 * @return  the weight
	 * @since   JDK 1.6
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * weight.
	 *
	 * @param   weight    the weight to set
	 * @since   JDK 1.6
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

}

