package allen._31_40;

/*题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两
岁。最后问第一个人，他说是10岁。请问第五个人多大？
1.程序分析：利用递归的方法，递归分为回推和递推两个阶段。要想知道第五个人岁数，需知道第四人的岁数，依次类推，推到第一人（10岁），再往回推。*/
public class Test34 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 下午02:23:50    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 下午02:23:50   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		//直接求解
		int n = 10;
        for (int i = 0; i < 4; i++) {
            n = n + 2;
        }
        System.out.println("第五个人" + n + "岁");
        
        System.out.println("第五个的年龄为" + getAge(5));
       

	}
	
	
	
	 //递归求解
    public static int getAge(int n) {
        if (n == 1) {
            return 10;
        }
        return 2 + getAge(n - 1);
    }

}
