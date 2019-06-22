package allen._31_40;

import java.util.Scanner;

/*题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 比较简单  方法也比较多 不细究*/
public class Test36 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午02:42:29    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午02:42:29   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入正整数：");
        long a = in.nextLong();
        if(a>10000&&a<99999)
        {
        	long gewei = a%10;
        	long wanwei = a/10000;
        	long shiwei = a%100/10;
        	long qianwei = a/1000%10;
    	   
    	   if(gewei==wanwei&&shiwei==qianwei)
    	   {
    		   System.out.println("你输入的"+a+"是回文数");
    	   }
    	   else 
    	   {
    		   System.out.println("你输入的"+a+"不是回文数");
    	   }
            
        }
        else 
        {
			System.out.println("请输入5位的正整数，谢谢");  
			System.exit(0);
		}

	}

}
