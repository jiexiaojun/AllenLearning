package allen._11_20;

import java.util.Scanner;
public class Test17 {
    public static void main(String[] args){
        int a,b,m,n;
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        a=in.nextInt();
        System.out.println("再输入一个正整数：");
        b=in.nextInt();
        m=commonDivisor(a,b);
        n=a*b/m;
        System.out.println("最大公约数："+m);
        System.out.println("最小公倍数："+n); 
    }
    
    
    
    
    /*题目：输入两个正整数m和n，求其最大公约数和最小公倍数。辗除法*/
    public static int commonDivisor(int x,int y)
    {
        if(x<y)//先交换位置 确保x大于等于y
        {
            int t=x;
            x=y;
            y=t;
        }
        while(y!=0)
        {
            if(x==y)
            {
            	return x;
            }
            else
            {
                int k=x%y;
                x=y;
                y=k;
            }
        }
        return x;
    }
    
    
    
    
}


