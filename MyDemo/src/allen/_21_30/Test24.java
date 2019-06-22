package allen._21_30;


/*题目：一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
1.程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上168后再开方，如果开方后的结果满足如下条件，即是结果。*/
public class Test24 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 上午09:44:48    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 上午09:44:48   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		for(int i=1;i<100000;i++)
		{
			boolean a = false;
			boolean b = false;
			if(Math.sqrt(i+100)%1==0)
			{
				a=true;
			}
			
			if(Math.sqrt(i+100+168)%1==0)//题目描述不明确是这个数单独加上100单独加上168 还是 加上100在加上168 不过两种说法都有结果
			{
				b=true;
			}
			if(a&&b)
			{
				System.out.println(i);
			}
		}

	}

}
