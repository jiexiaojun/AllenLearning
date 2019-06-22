package allen._00_10;


public  class Test00 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-7-21 上午11:17:10    
	 * 修改人：汪俊     
	 * 修改时间：2017-7-21 上午11:17:10   
	 * 修改备注：    
	 * @version V1.0       
	 */
	
	
	static { System.out.println("我是静态代码块");}
	
	public static void main(String[] args) {
		
			String s1 = "Programming";
	        String s2 = new String("Programming");
	        String s3 = "Program" + "ming";
	        System.out.println(s1 == s2);
	        System.out.println(s1 == s3);
	        System.out.println(s1 == s1.intern());
	        int a =5;
	        System.out.println(a>>2);
	        
	        short i = 128;
	        System.out.println((byte)i);
	        
	        
	}
	
	


}
