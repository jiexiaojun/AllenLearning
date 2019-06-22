package allen._21_30;

import java.util.Scanner;


/*题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
20万到40万之间时，高于20万元的部分，可提成5%；
40万到60万之间时高于40万元的部分，可提成3%；
60万到100万之间时，高于60万元的部分，可提成1.5%，
高于100万元时，超过100万元的部分按1%提成，
从键盘输入当月利润lirun，求应发放奖金总数sum？*/
public class Test23 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 上午09:30:23    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 上午09:30:23   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入利润值单位(万元)：");
		double lirun = in.nextLong();
		double sum =0;
		if(lirun<=10)
		{
			sum=lirun*0.1;
		}
		else if(lirun<=20) 
		{
			sum=10*0.1+(lirun-10)*0.075;
		}
		else if(lirun<=40) 
		{
			sum=10*0.1+10*0.075+(lirun-20)*0.05;
		}
		else if(lirun<=60) 
		{
			sum=10*0.1+10*0.075+20*0.05+(lirun-40)*0.03;
		}
		else if(lirun<=100) 
		{
			sum=10*0.1+10*0.075+20*0.05+20*0.03+(lirun-60)*0.015;
		}
		else if(lirun>100) 
		{
			sum=10*0.1+10*0.075+20*0.05+20*0.03+40*0.015+(lirun-100)*0.01;
		}
		
		System.out.println(sum);
		
	}

}
