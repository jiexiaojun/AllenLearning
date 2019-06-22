package slpcb;

import java.io.File;
import java.text.DecimalFormat;

/**
* 项目名称：testClass        
* 类名称：FileNumbers    
* 类描述：读取指定目录下的对象个数，以及对象信息
* 创建人：汪俊   
* 创建时间：2017-8-14 下午03:37:01    
* 修改人：汪俊  
* 修改时间：2017-8-14 下午03:37:01   
* 修改备注：    
* @version 1.0
 */
public class TestDirectoryMsg {
 public static void main(String[] args) {
  String path="D:/迅雷下载";
  File file=new File(path);
  File[] tempList = file.listFiles();
  System.out.println("该目录下对象个数："+tempList.length);
  for (int i = 0; i < tempList.length; i++) {
   if (tempList[i].isFile()) {
	   DecimalFormat decimalFormat=new DecimalFormat("0.00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
	   String name=tempList[i].getName();
	   String size=decimalFormat.format(tempList[i].length()*(float)1/1024/1024);//format 返回的是字符串
    System.out.println("文 件名称："+name+"；大小："+size+"M");
   }
   if (tempList[i].isDirectory()) {
    System.out.println("文件夹："+tempList[i]);
   }
  }
 }
}
