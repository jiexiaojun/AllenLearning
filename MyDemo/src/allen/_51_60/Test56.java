/**
 * @项目名称：testClass
 * @文件名称：Test56.java
 * @所属包名：lcy._51_60
 * @创建时间：2018年11月13日上午9:49:49
 * @Copyright (c) 2018 SLPCB All Rights Reserved.
 */ 

package allen._51_60;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @类名称：Test56
 * @类描述：TODO
 * @创建人：jie.xiaojun
 * @创建时间：2018年11月13日 上午9:49:49
 */

public class Test56 {

	/**
	 * @方法描述：日期 加减天数
	 * @创建人：jie.xiaojun
	 * @创建时间：2018年11月13日 上午9:49:49
	 * @修改人：jie.xiaojun
	 * @修改时间：2018年11月13日 上午9:49:49
	 * @修改内容：
	 * @param args	
	 * @version 1.0 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {

//		System.out.println(subDay("2018-03-01",-1));
//		String string = " 123 123   ";
//		System.out.println(string.trim());
		
		
		Date currentTime = new Date();
		DateFormat format= new SimpleDateFormat("yyyy年MM月dd日HH时");
		String dateString = format.format(currentTime);
		System.out.println(dateString);
	}
	
	
	
	
	public static String subDay(String date,int days) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date dt = sdf.parse(date);
	Calendar rightNow = Calendar.getInstance();
	rightNow.setTime(dt); 
	rightNow.add(Calendar.DAY_OF_MONTH,days);
	Date dt1 = rightNow.getTime();
	String reStr = sdf.format(dt1); 
	return reStr;
}

}

