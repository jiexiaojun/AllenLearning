package allen._31_40;


/*题目：求1+2!+3!+...+20!的和。
1.程序分析：此程序只是把累加变成了累乘。*/
public class Test32 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午12:08:38    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午12:08:38   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		int sum = 0 ;
		int temp = 1 ;
		for(int i=1;i<=20;i++)
		{
			temp*=i;
			System.out.println(temp);
			sum+=temp;
		}
		System.out.println(sum);

	}

}
