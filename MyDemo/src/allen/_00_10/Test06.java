package allen._00_10;

public class Test06 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-1 上午09:01:37    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-1 上午09:01:37   
	 * 修改备注：    
	 * @version V1.0       
	 */
		//静态变量  
		static String i=lcy();
		public static String lcy()
		{
			System.out.println("父类静态变量");
			return "静态变量";
		}		
		//静态语句块
		static {
		    System.out.println("父类静态语句块1");
		}
		//静态语句块
		static {
		    System.out.println("父类静态语句块2");
		}
		//静态语句块
		static{
		    System.out.println("父类静态语句块3");
		}
		
		//非静态变量  
		String j=pplcy();
		public String pplcy()
		{
			System.out.println("父类非静态变量");
			return "父类非静态变量";
		}	
		//非静态语句块
		{
		  System.out.println("父类非静态语句块1");
		}
		//非静态语句块
		{
		  System.out.println("父类非静态语句块2");
		}
		//非静态方法
		public void bDisplay(){
		    System.out.println("父类非静态方法");
		    return ;
		}
		//静态方法
		public static void bTest(){
		    System.out.println("父类静态方法");
		    return ;
		}
		//构造函数
		public Test06(){
		    System.out.println("父类构造函数");
		}

		
		public static void main (String args[]) {		
//			Test07 b=new Test07();
//			Test06 a=new Test06();
	    }

		
		
}
