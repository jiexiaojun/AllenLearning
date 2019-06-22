package allen._21_30;


/*题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程
序找出三队赛手的名单。*/
public class Test29 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-8-7 上午11:05:24    
	 * 修改人：汪俊     
	 * 修改时间：2017-8-7 上午11:05:24   
	 * 修改备注：    
	 * @version V1.0       
	 */
	static char[] m = { 'a', 'b', 'c' }; 
	static char[] n = { 'x', 'y', 'z' }; 
	
	public static void main(String[] args) {
		
		//方法一 有些看不明白 条件是自己推出来的？ 而且答案也不对
		for(int i=0;i<m.length;i++)
		{
			for(int j = 0; j < n.length; j++) 
			{
				if(m[i]=='a'&& n[j] == 'x')
				{
					continue;
				}
				else if((m[i] == 'c' && n[j] == 'x')
                        || (m[i] == 'c' && n[j] == 'z'))
				{
					
				}
				else if ((m[i] == 'a' && n[j] == 'y')
                        || (m[i] == 'b' && n[j] == 'y')) {
                    continue;
                } else
                    System.out.println(m[i] + " vs " + n[j]);
			}
		}
		
		//方法二  
		int i,j,k;  
	    //声明i,j,k分别为A,B,C的对手;  
	    for(i='X';i<='Z';i++)  
	    {  
	       for(j='X';j<='Z';j++)  
	       {  
		        for(k='X';k<='Z';k++)  
		        {  
		         if(i=='X'||k=='X'||k=='Z'||k==i||k==j||j==i) continue;   //附加添加  i j k  肯定互不相同
//		         if(i=='X'||k=='X'||k=='Z') continue;  
		         System.out.print("Rivals of A, B and C are: "+(char)i+" "+(char)j+" "+(char)k);  
		        }  
	       } 
	    }
		
	}

}
