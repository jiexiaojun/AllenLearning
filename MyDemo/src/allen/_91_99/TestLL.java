/**
 * @项目名称：testClass
 * @文件名称：TestLL.java
 * @所属包名：allen._91_99
 * @创建时间：2019年4月23日上午10:36:17
 * @Copyright (c) 2019 SLPCB All Rights Reserved.
 */ 

package allen._91_99;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @类名称：TestLL
 * @类描述：TODO
 * @创建人：jie.xiaojun
 * @创建时间：2019年4月23日 上午10:36:17
 */

public class TestLL {


	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	    System.out.println("请输入一个正整数：");
	    String mys= s.nextLine();
	    if(str_len(mys))
	    {
	    	int a = Integer.valueOf(mys);
	    	FindSolution(10,2,2,a);
	    }
	    else 
	    {
	    	System.exit(-1);
		}
	}
	
	public static boolean str_len(String x)
	{
	  //整数的正则
//	  String regEx = "^-?[1-9]\\d*|0$";
	  String regEx = "^[0-9]*[1-9][0-9]*$";//正整数
	  // 编译正则表达式
	  Pattern pattern = Pattern.compile(regEx);
	  Matcher matcher = pattern.matcher(x);
	  return matcher.matches();

	}
	
	public static void  FindSolution(int x, int y, int z, int n)
	{
	   
	}

}

