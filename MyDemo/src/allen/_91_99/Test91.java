package allen._91_99;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


/**
* 项目名称：testClass        
* 类名称：TestExcelImage    
* 类描述：将本地图片或者网络图片存入Excel中并导出到本地
* 创建人：汪俊   
* 创建时间：2017-8-14 上午11:51:58    
* 修改人：汪俊  
* 修改时间：2017-8-14 上午11:51:58   
* 修改备注：    
* @version 1.0
 */

public class Test91 {
	static List<BufferedImage> images = new ArrayList<BufferedImage>();
	static {
		try {
			//本地文件
			images.add(ImageIO.read(new File("C:/Users/lanston/Desktop/6666.png")));
			//网络图片
			images.add(ImageIO.read(new URL("https://gss0.bdstatic.com/94o3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike116%2C5%2C5" +
					"%2C116%2C38/sign=cbaa5a8d841001e95a311c5dd9671089/95eef01f3a292df58898bf71b5315c6034a8737e.jpg")));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		FileOutputStream fileOut = null;
		try {
			// 创建一个工作薄
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet1 = wb.createSheet("我是sheetName");
			// HSSFRow row = sheet1.createRow(2);
			HSSFPatriarch patriarch = sheet1.createDrawingPatriarch();
			short i = 0;
			for (BufferedImage image : images) {
				ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();
				ImageIO.write(image, "jpg", byteArrayOut);
				HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0,
						(short) 1, 1 + i, (short) 2, 2 + i);
				anchor.setAnchorType(0);
				// 插入图片
				patriarch.createPicture(
						anchor,
						wb.addPicture(byteArrayOut.toByteArray(),
								HSSFWorkbook.PICTURE_TYPE_JPEG)).resize(1);
				i++;
			}
			HSSFRow row = sheet1.createRow(10);
			short s = 10;
			HSSFCell cell = row.createCell(s);
			HSSFCellStyle style = wb.createCellStyle();
			HSSFFont font = wb.createFont();
			font.setStrikeout(true);
			style.setFont(font);
			cell.setCellStyle(style);
			cell.setCellValue("aaaaa");//excel指定单元格中插入值
			fileOut = new FileOutputStream("C:/Users/lanston/Desktop/workbook.xls");
			// 写入excel文件
			wb.write(fileOut);
			fileOut.close();
		} catch (IOException io) {
			io.printStackTrace();
			System.out.println("io erorr : " + io.getMessage());
		} finally {
			if (fileOut != null) {
				try {
					fileOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
