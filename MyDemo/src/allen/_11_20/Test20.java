package allen._11_20;


/*题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。
 *所谓因子就是能被该数整数的数*/
public class Test20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) 
        {
           if(result(i))
                System.out.print(i + " " );
        }
        System.out.println();
    }
    
    
    
    public static boolean result(int lcy)
    {
    	boolean flag = false;
    	int s=0;
    	for(int i=1;i<lcy;i++)
    	{
    		if(lcy%i==0)
    		{
    			s=s+i;
    		}
    	}
    	
    	if(lcy==s)
    	{
    		flag=true;
    	}
    	
		return flag;

    }
    
    
    
    
    
    
    
}
