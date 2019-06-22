package allen._51_60;


public class Test51 {
	
	//外部类的静态变量
	public static String haveStaticMsg="我是类的私有静态变量";
	//外部类的非静态变量
	public  String noStaticMsg="我是类的实例变量";
	//外部类的静态方法
	public static String staticMethod()
	{
		return haveStaticMsg;
	}
	//外部类的非静态方法
	public int noStaticMethod()
	{
		return 716;
	}
	
	//静态内部类
	public static class NestedStaticClass
	{
		//静态内部类只能访问外部类的静态成员和静态方法
		public void printMsg() 
		{
			System.out.println(haveStaticMsg);
			//System.out.println(noStaticMsg);//报错  不能访问非静态变量
			System.out.println(staticMethod());
			//System.out.println(noStaticMethod());//报错   不能访问非静态方法
		}
	}

	//非静态内部类
	public  class InnerClass
	{
		//非静态内部类能访问外部类的静态成员和静态方法和非静态成员和非静态方法
		public void display() 
		{
			System.out.println(haveStaticMsg);
			System.out.println(noStaticMsg);
			System.out.println(staticMethod());
			System.out.println(noStaticMethod());
		}
	}
	
	
	//在方法中定义的类   局部内部类
	public static void name() 
	{
		final int a = 1314520;
		class JubuClass//局部内部类
		{		
			//只能访问方法中定义为final类型的局部变量
			public void syso() {
				
				System.out.println(a);
			}
		}
		JubuClass aaClass = new JubuClass();
		aaClass.syso();
	}
	
	
	
	
	
	
	
	
	
	public static void main(String arg[])
	{
//		Test51.NestedStaticClass printer = new Test51.NestedStaticClass();
//		printer.printMsg();
//		
//		Test51.InnerClass inner = new Test51().new InnerClass();
//		inner.display();	
//		
//		name();
		System.out.println(staticMethod()); //静态方法 不需要创建对象就可以使用
		Test51 test51 = new Test51();
		System.out.println(test51.noStaticMethod()); //只有创建对象后才可被调用
		
		System.out.println(Test51.class.getMethods().getClass().getName());
		System.out.println(test51.getClass().getClass());
	}
	
}
