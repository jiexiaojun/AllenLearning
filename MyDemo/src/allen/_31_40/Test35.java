package allen._31_40;

import java.util.Scanner;


/*题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。 */
public class Test35 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午02:29:04    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午02:29:04   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入正整数：");
        long a = in.nextLong();
        if(a>0&&a<99999)
        {
        	String str =  String.valueOf(a);
    	    System.out.println("输入的是" + str.length() + "位数");
            StringBuffer buf = new StringBuffer(str);
            System.out.println(buf.reverse());//字符串反转
        }
        else 
        {
			System.out.println("请输入不多于5位的正整数，谢谢");  
			System.exit(0);
		}
	}

}
