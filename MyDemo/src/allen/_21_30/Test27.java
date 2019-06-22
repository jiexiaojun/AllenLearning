package allen._21_30;

/*题目：输出9*9口诀乘法表。
1.程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
/t的巧妙使用，避免了错位的问题*/
public class Test27 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 上午10:41:47    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 上午10:41:47   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
				{
					System.out.println(i+"*"+j+"="+i*j+"\t");
				}
				else 
				{
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
			}
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) 
		{
            for (int j = 1; j <= 9; j++)
            {
            	System.out.print(i + "*" + j + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
		System.out.println();
		for (int i = 1; i <= 9; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i + "*" + j + "=" + (i*j)+ "\t" );//制表符 （跳到下一个TAB位置）
			}
			System.out.println();
		}

	}

}
