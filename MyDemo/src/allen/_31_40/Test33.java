package allen._31_40;

import java.util.Scanner;


/*题目：利用递归方法求5!。
1.程序分析：递归公式：f(n)=n*f(n-1)
*/

public class Test33 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午02:19:50    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午02:19:50   
	 * 修改备注：    
	 * @version V1.0       
	 */
	 public static long fac(int n) {
	        long value = 0;
	        if (n == 1 || n == 0) {
	            value = 1;
	        } else if (n > 1) {
	            value = n * fac(n - 1);
	        }
	        return value;
	    }
	    public static void main(String[] args) {
	        System.out.println("请输入一个数：");
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        System.out.println(n + "的阶乘为：" + fac(n));
	    }

}
