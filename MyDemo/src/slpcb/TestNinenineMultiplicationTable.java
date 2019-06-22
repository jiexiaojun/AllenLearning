package slpcb;

public class TestNinenineMultiplicationTable {

	/**              
	 * 方法描述：打印九九乘法表  同Test27  Test27中方法更简便
	 * 创建人：汪俊    
	 * 创建时间：2016-3-10 下午02:36:50    
	 * 修改人：汪俊     
	 * 修改时间：2016-3-10 下午02:36:50   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<10&&j<=i;j++)
			{
				if(i==j)
				{
					if(i*j<10)
					{
						if(j==1)
						{
							System.out.println(i+"*"+j+"="+i*j+" ");
						}
						else
						{
							System.out.println(i+"*"+j+"="+i*j+"  ");
						}
					}
					else
					{
						System.out.println(i+"*"+j+"="+i*j+" ");
					}
				}
				else
				{
					if(i*j<10)
					{
						if(j==1)
						{
							System.out.print(i+"*"+j+"="+i*j+" ");
						}
						else
						{
							System.out.print(i+"*"+j+"="+i*j+"  ");
						}
					}
					else
					{
						System.out.print(i+"*"+j+"="+i*j+" ");
					}
				}
			}
		}
	}
}
