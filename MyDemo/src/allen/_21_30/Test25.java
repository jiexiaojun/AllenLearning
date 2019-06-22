package allen._21_30;

import java.util.Calendar;
import java.util.Scanner;

/*输入某年某月某日，判断这一天是这一年的第几天？
1.程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本月的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。*/

public class Test25 {
    public static void main(String[] args) {
        System.out.println("请输入年,月,日：");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int sum = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println("这一天是这一年的第" + sum +"天"); //利用系统函数 
        
        
        System.out.println("是该年的第"+count(year,month,day)+"天");//自己写方法
    }
    
    
    public static int count(int year,int month,int day){
        int sum=0;
        int days=0;
        for(int i=1;i<month;i++){
            switch(i){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                if(year%400==0||(year%4==0&&year%100!=0)){//闰年的条件是符合下面二者之一：(1)年份能被4整除，但不能被100整除；(2)能被400整除。
                    days=29;
                }else{
                    days=28;
                }
                break;
            }
            sum+=days;
        }
        sum+=day;
        return sum;
    }
}
