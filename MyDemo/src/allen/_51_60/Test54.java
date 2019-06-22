package allen._51_60;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test54 {

	/** 
	 * @Description: TODO
	 * @param args void  
	 * @author Jie.xiaojun
	 * @date 2018-5-17  下午03:48:16
	 */
	public static void main(String[] args) {
		int a=func();
		System.out.println(a);

		}
		
	
	public static int func() 
	{
		int result = 0;
		try {
			System.out.println("try");
//			result = 1;
			System.exit(0);
			return result;
		} catch (Exception e) {
			result = 2;
			System.out.println("catch");
			return result;
		} finally {
			System.out.println("finally");
			result = 3;
			System.out.println(result);
		}
	}

	
}
