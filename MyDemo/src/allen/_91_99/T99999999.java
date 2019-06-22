
package allen._91_99;

public class T99999999 {
	public static void main(String[] args) {
		
		int a=func();
		System.out.println(a);
		}
	
	@SuppressWarnings("finally")
	public static int func() 
	{
		int result = 0;
		try {
			System.out.println("try");
			result = 1;
			return result;
		} catch (Exception e) {
			result = 2;
			System.out.println("catch");
			return result;
		} finally {
			System.out.println("finally");
			result = 3;
			return result;
		}
	}
		 
}

