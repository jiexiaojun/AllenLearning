package allen._11_20;

import java.util.Scanner;

/*题目：求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。
 * 例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。*/
public class Test19 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入数字a(0到9任意数字)：");
        int a=in.nextInt();
        
        System.out.println("请输入相加数字的个数：");
       
        int b=in.nextInt();
        
        int s = 0;
        
        int t=0;
        
        for(int i=1;i<=b;i++)//相当巧妙啊 借用了一个中间变量专门求下一项的值 我没做出来看来脑子是生锈了 哎  
        {
        	  t+=a;
        	  a=a*10;
        	  s+=t;  	  
        }
       System.out.println(s);
    }
    
    
    
    
    
}


