package allen._91_99;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
* 项目名称：testClass        
* 类名称：Test    
* 类描述：向指定文件中写入数据
* 创建人：汪俊   
* 创建时间：2017-8-14 下午03:14:19    
* 修改人：汪俊  
* 修改时间：2017-8-14 下午03:14:19   
* 修改备注：    
* @version 1.0
 */
public class Test96 {
	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);// 集合中放入0-9
		}
		// 下面是写文件
		@SuppressWarnings("unused")
		boolean flag = false;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:/Users/lanston/Desktop/test.txt", true);
			bw = new BufferedWriter(fw, 100);
			for (Integer integer : list) {
				bw.write(integer + "");
				bw.write("汪俊是个大帅哥");
			}

			flag = true;
		} catch (IOException e) {
			System.out.println("写入文件出错");
			flag = false;
		} finally {
			if (bw != null) {
				bw.flush();
				bw.close();
			}
			if (fw != null)
				fw.close();
		}
	}
}