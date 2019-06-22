package allen._31_40;

import java.util.Random;

public class Test40 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午03:41:35    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午03:41:35   
	 * 修改备注：    
	 * @version V1.0       
	 */
	 public static void main(String[] args) {
	        int temp = 0;
	        int arr[] = new int[12];
	        Random r = new Random();
	        for (int i = 0; i <= 10; i++)
	            arr[i] = r.nextInt(1000);
	        for (int i = 0; i <= 10; i++)
	            System.out.print(arr[i] + "\t");
	        for (int i = 0; i <= 9; i++)
	            for (int k = i + 1; k <= 10; k++)
	                if (arr[i] > arr[k]) { //这里实现的是将最小的数 放在第一位
	                    temp = arr[i];
	                    arr[i] = arr[k];
	                    arr[k] = temp;
	                }
	        System.out.println();
	        for (int k = 0; k <= 10; k++)
	            System.out.print(arr[k] + "\t");
	        arr[11] = r.nextInt(1000);
	        for (int k = 0; k <= 10; k++)
	            if (arr[k] > arr[11]) {//循环每个数和最后一个数比较，如果大于最后一个数，后面的顺序后移
	                temp = arr[11];
	                for (int j = 11; j >= k + 1; j--)
	                    arr[j] = arr[j - 1];
	                    arr[k] = temp;
	            }
	        System.out.println();
	        for (int k = 0; k <= 11; k++)
	            System.out.print(arr[k] + "\t");
	    }

}
