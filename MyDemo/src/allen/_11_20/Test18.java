package allen._11_20;

import java.util.Scanner;

/*题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
1.程序分析：利用for循环语句,if条件语句。*/
public class Test18 {
    public static void main(String[] args){
        String str ;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一行字符：");
        str=in.nextLine();
        char[] ch=str.toCharArray();  //这句话是重点
        int a = 0;//数字个数
        int b = 0;//英文字母个数
        int c = 0;//空格个数
        int d = 0;//其他字符个数
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]>='0'&&ch[i]<='9')
        	{
        		a++;
        	}
        	else if((ch[i]>='a'&&ch[i]<='z')||ch[i]>='A'&&ch[i]<='Z')
        	{
        		b++;
        	}
        	else if (ch[i]==' ') 
        	{
				c++;
			}
        	else 
        	{
				d++;
			}
        	
        }
        System.out.println("数字个数:"+a);
        System.out.println("英文字母个数"+b);
        System.out.println("空格个数"+c);
        System.out.println("其他字符个数"+d);
    }
    
    
    
    
    
}


