package allen._00_10;

import java.util.Scanner;
/***
* 项目名称：testClass        
* 类名称：Test2    
* 类描述：已知关于x的一元二次方程ax2＋bx＋c＝0(a≠0)，设计一个算法，判断方程是否有实数根．
* 创建人：汪俊   
* 创建时间：2017-7-28 上午11:05:21    
* 修改人：汪俊  
* 修改时间：2017-7-28 上午11:05:21   
* 修改备注：    
* @version 1.0
 */
public class Test02 {
public static void main(String [] args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("请输入数字a：");
    String a= s.nextLine();
    Scanner s2 = new Scanner(System.in);
    System.out.println("请输入数字b：");
    String b= s2.nextLine();
    Scanner s3 = new Scanner(System.in);
    System.out.println("请输入数字c：");
    String c= s3.nextLine();
    
    
    
    
    System.out.println(str_len(a,b,c));
}
  public static String str_len(String a,String b,String c)
  {
	 int aa = Integer.parseInt(a);
	 int bb = Integer.parseInt(b);
	 int cc = Integer.parseInt(c);
	 
	 if(bb*bb-4*aa*cc>=0)
	 {
		 return "有根";
	 }
	 else
	 {
		 return "无根";
	 }
  }
}
