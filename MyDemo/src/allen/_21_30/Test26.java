package allen._21_30;

import java.util.Arrays;
import java.util.Scanner;


/*题目：输入三个整数x,y,z，请把这三个数由小到大输出。
1.程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，
然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。*/
public class Test26 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 上午10:22:09    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 上午10:22:09   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		  System.out.println("请输入整数x,y,z：");
	        Scanner in = new Scanner(System.in);
	        int x = in.nextInt();
	        int y = in.nextInt();
	        int z = in.nextInt();
	        
	        //方法一  利用系统方法自己排序
	        int[] arr = new int[3];
	        arr[0]=x;
	        arr[1]=y;
	        arr[2]=z;
	        Arrays.sort(arr);
	        for (int i=0;i<arr.length;i++) {
	            System.out.print(arr[i] + " ");
	        }
	        
	        
	        //方法二  自己手写判断方法
	        if(x>y)
	        {
	        	int t=x;
	        		x=y;
	        		y=t;
	        	
	        }
	        if(x>z)
	        {
	        	int t=x;
	        		x=z;
	        		z=t;
	        	
	        }
	        if(y>z)
	        {
	        	int t=y;
	        		y=z;
	        		z=t;
	        	
	        }
	        System.out.println("最小："+x+",中间："+y+",最大："+z);
	}

}
