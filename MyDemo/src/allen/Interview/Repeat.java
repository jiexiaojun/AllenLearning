package allen.Interview;

public class Repeat {

	/** 
	 * @Description: 对于一个字符串,请设计一个高效算法,找到第一次重复出现的字符串
	 * @param args void  
	 * @author Jie.xiaojun
	 * @date 2018-6-17  上午12:13:53
	 */
	public static void main(String[] args) {
		
		
		String string = "abcd123451";
		
		int length = string.length()-1;

		
		System.out.println(findFirstRepeatChar(string,length));

	}
	
	
	public static Object findFirstRepeatChar(String str,int length) 
	{
		boolean flag = true;
		int point = -1 ;
		for (int i = 0; i <=length&&flag; i++) 
		{
			for (int j = i+1; j <=length&&flag; j++) 
			{
				if(str.charAt(i)==str.charAt(j))
				{
					flag=false;
					point=i;
				}
			}
		}
		if(point>-1)
		{
			return str.charAt(point);
		}
		else
		{
			return null;
		}
	}
	

}
