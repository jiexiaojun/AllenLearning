package allen._51_60;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;


public class Test55 {

	/** 
	 * @Description: TODO
	 * @param args void  
	 * @author Jie.xiaojun
	 * @date 2018-6-11  下午05:12:47
	 */

	public static String getClientAddress(HttpServletRequest request) {
		String path = "http://" + request.getLocalAddr() + ":" + request.getLocalPort() + request.getContextPath();
		System.out.println(path);
		return path;
	}

	public static void main(String[] args) {

//		System.out.println(MD5Util.md5("000000"));
//		System.out.println(MD5Util.md5("666666"));
//		System.out.println(MD5Util.md5("888888"));

		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		test1(list);
		System.out.println(list.size());
		test1(list);

	}
	
	
	public static void test1(List<String> list) 
	{
		list.add("3");
	}
	
	public static void test2(List<String> list) 
	{
		list.add("3");
	}

}
