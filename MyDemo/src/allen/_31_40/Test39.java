package allen._31_40;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*对10个数进行排序。
利用了系统自动排序方法 （Arrays.sort）没啥好说的*/
public class Test39 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午03:24:05    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午03:24:05   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
			//随机生成的树
		    int arr[] = new int[11];
	        Random r = new Random();
	        for (int i = 0; i < 10; i++) {
	            arr[i] = r.nextInt(100) + 1; //得到10个100以内的整数
	        }
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length-1; i++) {
	            System.out.print(arr[i] +"\t");
	        }
	        System.out.print("\nPlease Input a int number:" );
	        Scanner in = new Scanner(System.in);
	        arr[10] = in.nextInt(); 
	        Arrays.sort(arr);
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] +"\t");
	        }
	        
	        //用户自己输入的数
	        System.out.println("请输入10个数：");
	        Scanner in2 = new Scanner(System.in);
	        int[] arr2 = new int[10];
	        for (int i = 0; i < 10; i++) {
	            arr2[i] = in2.nextInt(); 
	        }
	        for (int x : arr2) {//foreach遍历
	            System.out.print( x + "\t");
	        }

	}

}
