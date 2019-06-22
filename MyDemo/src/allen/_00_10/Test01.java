package allen._00_10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
* 项目名称：testClass        
* 类名称：Test1    
* 类描述：设计一个程序框图，使之能判断任意输入的整数x是奇数还是偶数．
* 创建人：汪俊   
* 创建时间：2017-7-28 上午11:05:10    
* 修改人：汪俊  
* 修改时间：2017-7-28 上午11:05:10   
* 修改备注：    
* @version 1.0
 */
public class Test01 {
public static void main(String [] args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("请输入一个整数：");
    String mys= s.nextLine();
    System.out.println(str_len(mys));
    
//    String regex = "^[A-Za-z]+$";
//    Pattern pattern = Pattern.compile(regex);
//    Matcher matcher = pattern.matcher(mys);
//    boolean rs = matcher.matches();
//    System.out.println(rs);
}
  public static String str_len(String x)
  {
	  //整数的正则
	  String regEx = "^-?[1-9]\\d*|0$";
	  // 编译正则表达式
	  Pattern pattern = Pattern.compile(regEx);
	  Matcher matcher = pattern.matcher(x);
	  boolean rs = matcher.matches();
	  if(rs)
	  {
		  if(Integer.parseInt(x)%2==1)
		  {
			  return "奇数";
		  }
		  else
		  {
			  return "偶数";
		  }
	  }
	  else 
	  {
		return "请输入整数";
	  }  
	  
  }
}
