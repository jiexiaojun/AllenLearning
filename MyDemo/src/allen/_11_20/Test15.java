package allen._11_20;

public class Test15 {

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
		for(int i=100;i<1000;i++)
		{
			boolean flag = result(i);
			if(flag)
			{
				count++;
				a[count-1]=i;
			}
		}
		System.out.println("水仙花数个数为："+count+",它们分别是：");
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{System.out.print(a[i]+"  ");}
		}
	}

	 /* 题目：打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。
	  	例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。*/
	public static boolean result(int lcy)
	{
		boolean flag = false;
		int a = lcy/100;
		int b = lcy%100/10;
		int c = lcy%100%10;
		int d = a*a*a+b*b*b+c*c*c;
		if(lcy==d)
		{
			flag = true;
		}
		return flag;
	}
	
}
