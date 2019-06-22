package com.Allen.DesignPattern.Prototype.greatestsage;

import java.io.Serializable;

/**
 * 金箍棒
 * @author Tom
 *
 */
@SuppressWarnings("unused")
public class GoldRingedStaff implements Serializable {

	/**
	 * @变量用途：TODO
	 */
	private static final long serialVersionUID = 6984726612428110978L;

	private float height = 100; // 长度
	private float diameter = 10;// 直径

	/**
	 * 金箍棒长大
	 */
	public void grow() {
		this.diameter *= 2;
		this.height *= 2;
	}

	/**
	 * 金箍棒缩小
	 */
	public void shrink() {
		this.diameter /= 2;
		this.height /= 2;
	}

}
