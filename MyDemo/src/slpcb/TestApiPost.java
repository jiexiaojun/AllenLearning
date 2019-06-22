package slpcb;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.util.IOUtils;

import com.alibaba.fastjson.JSONObject;

public class TestApiPost {

    public static String PostRequest(String URL,String jsonString ) {
    	StringBuilder sb = new StringBuilder();  
        try {
            //创建连接
            URL url = new URL(URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("Content-Type", "text/json");
            connection.connect();
            //POST请求
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            out.writeBytes(jsonString);
            out.flush();
            out.close();
            InputStream instr = connection.getInputStream();
            byte[] bis = IOUtils.toByteArray(instr);
            String ResponseString = new String(bis, "UTF-8");
            if ((ResponseString == null) || ("".equals(ResponseString.trim()))) {
                System.out.println("返回空");
            }
            return ResponseString;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
	
    
    public static void main(String[] args) throws IOException {
    	
    	String URL = "http://192.168.1.58:8001/app/mobilebase/checkRight";
    	JSONObject obj = new JSONObject();
        obj.put("appkey", "slclient");
        obj.put("loginuser", "admin");
        obj.put("sign", "25f24f665f917ca20f567d1ed2fab218");
        obj.put("time", "1488599539603");
        obj.put("UserName", "9094");
  
        String  jsonString = obj.toString();
        System.out.println(PostRequest(URL,jsonString));    
    	
   
    	
    	
    }
    
    


}