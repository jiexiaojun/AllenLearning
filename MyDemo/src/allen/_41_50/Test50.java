package allen._41_50;



public class Test50 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-11-17 下午12:03:51    
	 * 修改人：汪俊     
	 * 修改时间：2017-11-17 下午12:03:51   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String[] args) {
		
//    	StringBuffer s1 = new StringBuffer("hello");
//    	StringBuffer s2 = new StringBuffer("hello");
//    	fun(s1, s2);  
//    	System.out.println(s1);
//    	System.out.println(s2);
    	
//    	Integer it1=new Integer(21);
//    	Integer it2=new Integer(21);
//    	fun(it1, it2);  
//    	System.out.println(it1);
//    	System.out.println(it2);
    	
    	
    	
//    	int  i=500;
//    	Integer aInteger = 500;  	
//    	Integer bInteger =  new Integer(500);
//    	System.out.println(i==aInteger);
//    	System.out.println(i==bInteger);
    	
//    	Integer i5=12;
//    	Integer i6=12;
//    	Integer i7= new Integer(12);
//    	System.out.println(i5==i7);
    	
    	
//    	byte a = 5;
//    	int b=5;
//    	System.out.println(a>>2);
//    	System.out.println(b>>2);
//    	System.out.println(a>>7);
//    	System.out.println(a>>7>>2);
    	
    	
//    	short i1 =128;
//    	System.out.println((byte)i1);
    	
//    	TestApiPost  aapiPost = new TestApiPost();
//    	TestApiPost  bapiPost = new TestApiPost();
//    	System.out.println(aapiPost.equals(bapiPost));
//    	System.out.println(aapiPost==bapiPost);
//    	System.out.println(aapiPost.hashCode());
//    	System.out.println(bapiPost.hashCode());
    	
//    	String lcy = new String("啪啪啪");
//    	String lcy1 = "啪啪啪pa";

//    	System.out.println(lcy.hashCode());
//    	lcy=lcy1;
//    	System.out.println(lcy.hashCode());
//    	
//    	System.out.println(lcy.hashCode());
//    	System.out.println(lcyInteger.hashCode());
    	
//    	StringBuffer sb = new StringBuffer();
//    	sb.append("hello");
//    	System.out.println(sb.toString());
    	
//    	String s = "ABC";  
//    	lcy = s.toLowerCase(); 
//    	System.out.println(s);
//    	System.out.println(lcy);
    	
    	
//    	short aaa = 1;
//    	int bbb=aaa;
//    	System.out.println(bbb);
//    	
//    	int a =1;
//    	short b = (short) a;
    	
//    	int [] b= {1,2,3,4,5};
//    	String[] a = {"1","2","3","4","5"};
//    	for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
//    	
//    	int [][] arr1= new int[2][2];
//    	arr1 =new int[][] { { 1, 2, 3 }, { 4, 5, 6,7 } };
//    	
//    	System.out.println(arr1[0][0]);
		
		
//		//1*初始化的时候赋值
//		String[] aArray = new String[5]; //如果是int类型 就是默认值0，对象类型String以及包装类 就是null
//		aArray= new String[]{"a","b","c","d","e","f","g"};
//		
//		String[] bArray = {"a","b","c", "d", "e"};
//		bArray= new String[]{"a","b","c","d","e","f"};
//		
//		String[] cArray = new String[]{"a","b","c","d","e"};
//		cArray= new String[]{"a","b","c","d","e","f"};
//		
//		//2.通过for循环赋值
//		for (int i = 0; i < aArray.length; i++) {
//			aArray[i]=String.valueOf(i+2);
//		}
//		
//		for (int i = 0; i < aArray.length; i++) {
//			System.out.println(aArray[i]);
//		}
		
//		String qString ="dddd";
//		int i =0;
//		int j = 0;
//		int c =0;
//		label:while(true)
//		{
//			//满足某个条件 就跳出循环
//	        if(j*i == 81)
//	        {
//	        	c=j*i;
//	        	break label; // continue label
//	        }   
//	         j++;
//	         i++;	           
//		}
//		System.out.println(qString.equals(qString));//9
		
//		int a=func();
//		System.out.println(a);
		
		
		//调用该函数  
//		int num = 5;  
//		System.out.println(num);  
//		changeValue(num);  
//		System.out.println(num); 
		
		
		
//		String i = "DDDD";
//		i.toLowerCase();
//		System.out.println(i);
		
//		Test52 test52 = new Test52();
//		System.out.println(test52.a);

		

	}
	
	
	public static void changeValue(int num) {  
		num = num *2;  
		}  
	
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
		}
	}

}
