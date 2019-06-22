package allen._11_20;

public class Test14 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-4 上午11:38:25    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-4 上午11:38:25   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		int count = 0;
		int a[] = new int[100]; 
		for(int i=101;i<201;i++)
		{
			boolean flag = result(i);
			if(flag)
			{
				count++;
				a[count-1]=i;
			}
		}
		System.out.println("101-200之间素数个数为："+count+",它们分别是：");
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{System.out.print(a[i]+"   ");}
		}
	}

	 /*题目：判断101-200之间有多少个素数，并输出所有素数。
	 1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。*/
	public static boolean result(int lcy)
	{
		boolean flag = true;
//		for(int i=2;i<Math.sqrt(lcy)+1;i++)
		for(int i=2;i<lcy;i++)
		{
			if(lcy%i==0)
			{
				flag=false;
			}
			
		}
		return flag;
	}
	
}
