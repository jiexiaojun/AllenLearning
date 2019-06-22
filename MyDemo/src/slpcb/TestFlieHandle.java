package slpcb;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

@SuppressWarnings("resource")
public class TestFlieHandle {

	/**
	* 方法描述：移动端—java对已知目录中文件的处理
	* 创建人：汪俊    
	* 创建时间：2017-8-14 下午03:40:44    
	* 修改人：汪俊     
	* 修改时间：2017-8-14 下午03:40:44   
	* 修改备注：    
	* @version V1.0
	 */
	public static void main(String[] args) {

		// try {
		// String str=getInputMessage();
		// System.out.println(str);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// String src="C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/Weekrecord.txt";
		// String dest="C:/Users/lanston/Desktop/桌面临时存放/接收下载文件/Weekrecord.sql";
		// try {
		// copyFile(src,dest);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }


		// PrintStreamDemo();


		// try {
		// StringBufferDemo();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		// String path="C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/";
		// renameFile(path,"sms.text","sms.txt");

		// String oldpath="C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/";
		// String newpath="C:/Users/lanston/Desktop/桌面临时存放/接收下载文件/";
		// String filename="test.txt";
		// changeDirectory( filename, oldpath, newpath, true);



		// String path="C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/test.txt";
		// try {
		// FileInputStreamDemo(path);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }


		// String newpath="C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/haha.doc";
		// try {
		// BufferedReaderDemo(newpath);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }


		// String newpath="C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/haha.doc";
		// try {
		// codeString(newpath);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }

		// String newpath="C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/web.xml";
		// try {
		// readXml(newpath);
		// } catch (DocumentException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }


		// String newpath="C:/Users/lanston/Desktop/桌面临时存放/接收视频文件/";
		// createDir(newpath);


		String newpath = "C:/Users/lanston/Desktop/桌面临时存放/接收视频文件/";
		delDir(newpath);
	}

	/**
	 * 
	* 方法描述：获得控制台用户输入的信息 、可以返回用户输入的信息，不足之处在于不支持中文输入，有待进一步改进
	* 创建人：lanston     
	* 创建时间：2016-1-23 下午04:41:40    
	* 修改人：lanston     
	* 修改时间：2016-1-23 下午04:41:40   
	* 修改备注：    
	* @version
	 */
	public static String getInputMessage() throws IOException {
		System.out.print("请输入您的命令∶");
		byte buffer[] = new byte[1024];
		int count = System.in.read(buffer);
		char[] ch = new char[count - 2];// 最后两位为结束符，删去不要
		for (int i = 0; i < count - 2; i++)
			ch[i] = (char) buffer[i];
		String str = new String(ch);
		return str;
	}

	/**
	 * 
	* 方法描述：以文件流的方式复制文件
	* 创建人：lanston     
	* 创建时间：2016-1-23 下午04:43:23    
	* 修改人：lanston     
	* 修改时间：2016-1-23 下午04:43:23   
	* 修改备注：    
	* @version
	 */
	public static void copyFile(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while ((c = in.read(buffer)) != -1) {
			for (int i = 0; i < c; i++)
				out.write(buffer[i]);
		}
		in.close();
		out.close();
	}


	/**
	 * 
	* 方法描述：利用PrintStream写文件
	* 创建人：lanston     
	* 创建时间：2016-1-23 下午05:04:33    
	* 修改人：lanston     
	* 修改时间：2016-1-23 下午05:04:33   
	* 修改备注：    
	* @version
	 */

	public static void PrintStreamDemo() {
		try {
			FileOutputStream out = new FileOutputStream("C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/test.txt");
			PrintStream p = new PrintStream(out);
			for (int i = 0; i < 10; i++)
				p.println("This is " + i + " line");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	* 方法描述：利用StringBuffer写文件
	* 创建人：lanston     
	* 创建时间：2016-1-23 下午05:17:34    
	* 修改人：lanston     
	* 修改时间：2016-1-23 下午05:17:34   
	* 修改备注：    
	* @version
	 */
	public static void StringBufferDemo() throws IOException {
		File file = new File("C:/Users/lanston/Desktop/桌面临时存放/接收上传文件/sms.log");
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file, true);
		for (int i = 0; i < 2; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append("这是第" + i + "行:前面介绍的各种方法都不关用,为什么总是奇怪的问题 ");
			out.write(sb.toString().getBytes("utf-8"));
		}
		out.close();
	}

	/**
	 * 
	* 方法描述：文件重命名
	* 创建人：lanston     
	* 创建时间：2016-1-23 下午05:23:33    
	* 修改人：lanston     
	* 修改时间：2016-1-23 下午05:23:33   
	* 修改备注：    
	* @version
	 */
	public static void renameFile(String path, String oldname, String newname) {
		if (!oldname.equals(newname)) {// 新的文件名和以前文件名不同时,才有必要进行重命名
			File oldfile = new File(path + "/" + oldname);
			File newfile = new File(path + "/" + newname);
			if (newfile.exists())// 若在该目录下已经有一个文件和新文件名相同，则不允许重命名
				System.out.println(newname + "已经存在！");
			else {
				oldfile.renameTo(newfile);
			}
		}
	}

	/**
	 * 
	* 方法描述：转移文件目录 类似剪切
	* 创建人：lanston     
	* 创建时间：2016-1-23 下午05:28:47    
	* 修改人：lanston     
	* 修改时间：2016-1-23 下午05:28:47   
	* 修改备注：    
	* @version
	 */
	public static void changeDirectory(String filename, String oldpath, String newpath, boolean cover) {
		if (!oldpath.equals(newpath)) {
			File oldfile = new File(oldpath + "/" + filename);
			File newfile = new File(newpath + "/" + filename);
			if (newfile.exists()) {// 若在待转移目录下，已经存在待转移文件
				if (cover)// 覆盖
				{
					newfile.delete();
					oldfile.renameTo(newfile);
				}
				else {
					System.out.println("在新目录下已经存在：" + filename);
				}
			}
			else {
				oldfile.renameTo(newfile);
			}
		}
	}

	/**
	 * 
	* 方法描述：利用FileInputStream读取文件
	* 创建人：lanston     
	* 创建时间：2016-1-25 上午08:52:27    
	* 修改人：lanston     
	* 修改时间：2016-1-25 上午08:52:27   
	* 修改备注：    
	* @version
	 */
	public static String FileInputStreamDemo(String path) throws IOException {
		File file = new File(path);
		if (!file.exists() || file.isDirectory())
			throw new FileNotFoundException();
		FileInputStream fis = new FileInputStream(file);
		byte[] buf = new byte[1024];
		StringBuffer sb = new StringBuffer();
		while ((fis.read(buf)) != -1) {
			sb.append(new String(buf));
			buf = new byte[1024];// 重新生成，避免和上次读取的数据重复
		}
		System.out.println(sb.toString());
		return sb.toString();
	}


	/**
	 * 
	* 方法描述：利用BufferedReader读取  
	* 创建人：lanston     
	* 创建时间：2016-1-25 上午08:57:40    
	* 修改人：lanston     
	* 修改时间：2016-1-25 上午08:57:40   
	* 修改备注：    
	* @version
	 */
	// BufferedReader buffer = new BufferedReader( new InputStreamReader(in,"GB2312"));
	public static String BufferedReaderDemo(String path) throws IOException {
		File file = new File(path);
		if (!file.exists() || file.isDirectory())
			throw new FileNotFoundException();
		FileInputStream fr = new FileInputStream(path);
		InputStreamReader is = new InputStreamReader(fr, "GBK");
		BufferedReader br = new BufferedReader(is);
		String temp = null;
		StringBuffer sb = new StringBuffer();
		temp = br.readLine();
		while (temp != null) {
			sb.append(temp + " ");
			temp = br.readLine();
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

	/** 
	 * 判断文件的编码格式 
	 * @param fileName :file 
	 * @return 文件编码格式 
	 * @throws Exception 
	 */
	public static String codeString(String fileName) throws Exception {
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
		int p = (bin.read() << 8) + bin.read();
		String code = null;

		switch (p) {
			case 0xefbb:
				code = "UTF-8";
				break;
			case 0xfffe:
				code = "Unicode";
				break;
			case 0xfeff:
				code = "UTF-16BE";
				break;
			default:
				code = "GBK";
		}
		System.out.println(code);
		return code;

	}

	/**
	 * 
	* 方法描述：利用dom4j读取xml文件
	* 创建人：lanston     
	* 创建时间：2016-1-25 上午09:28:56    
	* 修改人：lanston     
	* 修改时间：2016-1-25 上午09:28:56   
	* 修改备注：    
	* @version
	 */
	public static Document readXml(String path) throws DocumentException, IOException {
		File file = new File(path);
		BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
		SAXReader saxreader = new SAXReader();
		Document document = (Document) saxreader.read(bufferedreader);
		bufferedreader.close();
		return document;
	}


	/**
	 * 
	* 方法描述：创建文件夹
	* 创建人：lanston     
	* 创建时间：2016-1-25 上午09:43:30    
	* 修改人：lanston     
	* 修改时间：2016-1-25 上午09:43:30   
	* 修改备注：    
	* @version
	 */
	public static void createDir(String path) {
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdir();
			System.out.println("创建成功");
		}
		else {
			System.out.println("文件夹存在");
		}

	}


	/**
	 * 
	* 方法描述：删除目录
	* 创建人：lanston     
	* 创建时间：2016-1-25 上午09:47:52    
	* 修改人：lanston     
	* 修改时间：2016-1-25 上午09:47:52   
	* 修改备注：    
	* @version
	 */
	public static void delDir(String path) {
		File dir = new File(path);
		if (dir.exists()) {
			File[] tmp = dir.listFiles();
			for (int i = 0; i < tmp.length; i++) {
				if (tmp[i].isDirectory()) {
					delDir(path + "/" + tmp[i].getName());
				}
				else {
					tmp[i].delete();
				}
			}
			dir.delete();
		}
	}



}
