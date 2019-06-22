package allen._21_30;

public class Test30 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 上午11:26:19    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 上午11:26:19   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
//		打印出如下图案（三角形）		
//		*
//		***
//		*****
//		*******
//		*****
//		***
//		*
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=2*i-1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=2*i-1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		打印出如下图案（菱形）
//		   * 
//		  *** 
//		 *****
//		*******
//		 *****
//		  ***
//		   *
		 for(int i=1;i<= 4;i++) 
		 {			 
	         for (int k = 1; k <= 4 - i; k++)//巧妙之处  用空格补充
	                System.out.print( " " );
	         for (int j = 1; j <= 2 * i - 1; j++)
	                System.out.print("*");
	            	System.out.println();
	     }
		 for(int i=3;i>= 1;i--) 
		 {			 
	         for (int k = 1; k <= 4 - i; k++)
	                System.out.print( " " );
	         for (int j = 1; j <= 2 * i - 1; j++)
	                System.out.print("*");
	            	System.out.println();
	     }
		

	}

}
