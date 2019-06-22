package allen._31_40;

/*题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
1.程序分析：请抓住分子与分母的变化规律。 */
public class Test31 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 上午11:46:45    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 上午11:46:45   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		float fm = 1.0f;
        float fz = 2.0f;
        float sum =0f;
        for(int i=1;i<=20;i++)
        {
        	sum+=fz/fm;
        	float temp = fm;
        	fm=fz;
        	fz=fm+temp;
        }
        System.out.println(sum);
	}

}
