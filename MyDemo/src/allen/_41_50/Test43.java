package allen._41_50;

import java.util.Scanner;

public class Test43 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午05:10:26    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午05:10:26   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		System.out.println("请输入人数n:");
		Scanner in = new Scanner(System.in);
		int n =  in.nextInt();
		boolean lcy[] = new boolean[n];
		for(int i=0;i<lcy.length;i++)
		{
			lcy[i]=true; //设置默认值 true 说明初始时候全部在圈里里面
		}
		
		int leftPeople = n;
		int index =0;
		int baoshu = 0;
		while (leftPeople>1)  //只要人数大于1  继续报数
		{
			if(lcy[index]==true) //如果该人在圈子中
			{
				baoshu++;//报数自增1
				if(baoshu==3) //如果报数正好是3
				{
					lcy[index]=false; //该人不在圈子中
					baoshu=0; //报数重置
					leftPeople--;//圈内人数减1
				}
			}
			index++; //每报一次数，下标加一
			if(index==n) //是循环数数，当下标大于n时，说明已经数了一圈，
			{
				index=0; //将下标设为零重新开始。
			}
			
		}
		
		for(int i=0;i<lcy.length;i++)
		{
			if(lcy[i]==true)
			{
				System.out.println(i);
			}
		}
		//java算法题 第37题
	}

}
