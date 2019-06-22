package allen._51_60;

import java.util.Calendar;
import java.util.Date;

public class Test53 {

	/**              
	 * 方法描述：移动端—
	 * 创建人：汪俊    
	 * 创建时间：2017-11-20 上午10:30:36    
	 * 修改人：汪俊     
	 * 修改时间：2017-11-20 上午10:30:36   
	 * 修改备注：    
	 * @version V1.0       
	 */
	public static void main(String args[]) {
		String groupName ="学";
		//flag 不为 -1 说明是锣房老厂的
		int flag = groupName.indexOf("锣房老厂");
		System.out.println(100%3);
		System.out.println(100%3.0);
		System.out.println(groupName.getBytes().length);
	}
	
	public static String getWeekOfDate(Date dt) {
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;

        return weekDays[w];
    }

}
