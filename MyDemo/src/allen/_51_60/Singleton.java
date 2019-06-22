package allen._51_60;


public class Singleton
{
	private Singleton() {};//私有的构造函数
	
	private static final Singleton instence = new Singleton();  //静态变量
	
	
	//静态方法
	public static Singleton getInstence() 
	{
		return instence;
	}

}