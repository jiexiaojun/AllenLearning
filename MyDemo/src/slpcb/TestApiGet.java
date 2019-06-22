package slpcb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.alibaba.fastjson.JSONObject;


/**
* 项目名称：testClass        
* 类名称：UrlLoadJson    
* 类描述：java调用API(get传参)
* 创建人：汪俊   
* 创建时间：2017-8-14 下午02:36:37    
* 修改人：汪俊  
* 修改时间：2017-8-14 下午02:36:37   
* 修改备注：    
* @version 1.0
 */



/*GET请求的数据会附在URL之后（就是把数据放置在HTTP协议头中），以?分割URL和传输数据，参数之间以&相连，
如：login.action?name=hyddd&password=idontknow
GET方式提交的数据最多只能是1024字节*/

public class TestApiGet {
	public static String loadJson (String url) {  
        StringBuilder json = new StringBuilder();  
        try {
        	//url解析 无法解析空格，所以先将空格替换为%加字符的ASCII码
        	String newUrl=url.replace(" ", "%20");
            URL urlObject = new URL(newUrl);  
            URLConnection uc = urlObject.openConnection();  
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));  
            String inputLine = null;  
            while ( (inputLine = in.readLine()) != null) {  
                json.append(inputLine);  
            }  
            in.close();  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return json.toString();  
    }  
	
	public static void main(String[] args) { 

		String jobNum="09094";
		String beginTime="2017-08-12 08:00";
		String endTime="2017-08-12 17:30";
		String url = "http://114.215.176.82:4040/transfer/transferManger/cardRecords?jobNum="+jobNum+"&beginTime="+beginTime+"&endTime="+endTime;   		
        String json = TestApiGet.loadJson(url);
        JSONObject jsonObj = JSONObject.parseObject(json);
        String result = jsonObj.getString("message");
        System.out.println(result);
    }  

}
