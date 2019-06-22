package allen._91_99;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * 
* 类名称：CalendarTest    
* 类描述：日期字符串转换、日期函数、日历函数的调用
* 创建人：lanston     
* 创建时间：2016-1-21 上午08:47:56    
* 修改人：lanston     
* 修改时间：2016-1-21 上午08:47:56   
* 修改备注：    
* @version
 */
public class Test93 {

	public static void main(String[] args) throws Exception {

//		 Date date=new Date();
//		 Calendar startCal = Calendar.getInstance();
//		 startCal.setTime(date);  
//		 String startTime=startCal.get(Calendar.MONTH)+1+"-"+startCal.get(Calendar.DAY_OF_MONTH)+" "+startCal.get(Calendar.HOUR_OF_DAY)+":"+startCal.get(Calendar.MINUTE);
//		
//		 String strtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//		 String strtime1 = new SimpleDateFormat("MM-dd HH:mm").format(new Date());
////		 System.out.println(startTime+strtime+strtime1);
//		 
//		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
//		 Date startDate=sdf.parse("2015-01-01 10:10");
//		 
//		 String a= new SimpleDateFormat("MM-dd HH:mm").format(startDate);
//		 
//		 
//		 String str="2015-10-10 10:10:10";
//		 String str1="2015-10-10 10:10";
//		 System.out.println(str.substring(5, 16));
//		 System.out.println(str1.substring(5, 16));
		
		
//		String str = "2015-01-01 10:10";
//		int i = Integer.parseInt(str.substring(11, 13));
//		System.out.println(i);
		
//		
//			Calendar c = Calendar.getInstance();
//			Calendar c1 = Calendar.getInstance();
//			System.out.println(c1.getTimeInMillis());
//			
//			c1.add(Calendar.MONTH, -3);
//			System.out.println(c1.getTimeInMillis());
		
//		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
//		 Date date=sdf.parse("2016-05-27 10:10");
//		 SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
//		 String a=dateFm.format(date);
//		 System.out.println(a);

//			String a = "SLWX160630001";
//			System.out.println(a.substring(0, 13));
		
//		String aString = "2017-01-12 20:00";
//		String bString = "2017-01-12 23:45";
//		float a =DateUtils.hoursBetween(aString, bString);
//		int b =DateUtils.daysBetween(aString, bString);
//		System.out.println(aString.substring(0, 10));
//		System.out.println(a);
//		int a=2;
//		int b=1;
//		int c=3;
//		System.out.println(a==2?b:c);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
//		Date date=sdf.parse("2017-01-01");
		Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date); // 设置为当前时间
		System.out.println(calendar.getTimeInMillis());
        
//        
//        
//        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // 设置为上一个月
//        date = calendar.getTime();
//		
//        String strtime1 = sdf.format(date);
//        System.out.println(strtime1);
//        
//        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // 设置为上一个月
//        date = calendar.getTime();
//        String strtime2 = sdf.format(date);
//        System.out.println(strtime2);	
		
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		int dayOfWeek=calendar1.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(dayOfWeek);
		int offset1=1-dayOfWeek;
		int offset2=7-dayOfWeek;
		calendar1.add(Calendar.DATE, offset1-7);
		calendar2.add(Calendar.DATE, offset2-7);
		String a= new SimpleDateFormat("yyyy-MM-dd").format(calendar1.getTime())+" 00:00";
		String b= new SimpleDateFormat("yyyy-MM-dd").format(calendar2.getTime())+" 23:59";
		System.out.println(a);
		System.out.println(b);
		
	}

}
