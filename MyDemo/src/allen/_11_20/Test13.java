package allen._11_20;

public class Test13 {

	/**
	* 方法描述：移动端—
	* 创建人：汪俊    
	* 创建时间：2017-8-4 上午11:23:16    
	* 修改人：汪俊     
	* 修改时间：2017-8-4 上午11:23:16   
	* 修改备注：    
	* @version V1.0
	 */
	public static void main(String[] args) {
		for (int i = 0; i <20; i++) 
		{
			String lcy = "第"+(i+1)+"个月的兔子对数为"+result(i+1)+"对";
			System.out.println(lcy);
		}
	}
	
	/*题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子队数为多少？
	1.程序分析：兔子的规律为数列1,1,2,3,5,8,13,21....*/
	
	public static int result(int lcy)
	{
		if(lcy==1||lcy==2)
		{
			return 1;
		}
		else 
		{
			return result(lcy-1) + result(lcy-2);
		}
	}
	

}
