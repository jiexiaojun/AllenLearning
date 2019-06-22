/**
 * @项目名称：testClass
 * @文件名称：TestLLLLLL.java
 * @所属包名：allen._91_99
 * @创建时间：2019年6月17日下午4:04:06
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */ 

package allen._91_99;

/**
 * @类名称：TestLLLLLL
 * @类描述：TODO
 * @创建人：jie.xiaojun
 * @创建时间：2019年6月17日 下午4:04:06
 */

public class TestLLLLLL {
	
public static void main(String[] args) {
	for (int i = 0; i < 5000; i++) {
		int Max = 24;
		int Min = 22;
		int temp = (int) (Math.random()*(Max-Min+1)+Min);
		if(temp<Min||temp>Max)
		System.out.println(temp);

	}
}
}

