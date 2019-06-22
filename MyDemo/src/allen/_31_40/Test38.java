package allen._31_40;


/*题目：求100之内的素数*/
public class Test38 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午02:58:02    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午02:58:02   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		for(int i=2;i<=100;i++)
		{
			boolean lcy = result(i);
			if(lcy)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		for(int i=2;i<=100;i++)
		{	 
			int w=1;
			for(int j=2;j<i;j++)
			{
				  w=i%j;
	             if(w==0)break;
			}
			if(w!=0)
	        System.out.print(i+"是素数"); 
		}

	}
	
	
	
	public static boolean result(int lcy)
	{
		boolean flag = true;
		for(int i=2;i<lcy;i++)
		{
			if(lcy%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

}
