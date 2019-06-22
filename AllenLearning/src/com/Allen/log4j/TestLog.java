/**
 * @项目名称：AllenLearning
 * @文件名称：TestLog.java
 * @所属包名：com.Allen.log4j
 * @创建时间：2019年5月16日下午3:36:42
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */
package com.Allen.log4j;

import org.apache.log4j.Logger;

/**
 * @类名称：TestLog
 * @类描述：TODO
 * @创建人：allen
 * @创建时间：2019年5月16日 下午3:36:42
 */
public class TestLog {

	static Logger logger = Logger.getLogger(TestLog.class.getName());

	public TestLog() {}

	public static void main(String[] args) {
		logger.info("ddddddddddddddddddddddd");

	}

}

