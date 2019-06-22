package slpcb;

import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;


@SuppressWarnings({"deprecation"})
public class TestExportExcel {

	public static void main(String[] args) throws Exception {
		String sheetName = "用车统计表单";
		String titleName = "用车申请数据统计表";
		String fileName = "用车申请统计表单";
		int columnNumber = 3;
		int[] columnWidth = {10, 20, 30};
		String[][] dataList =
				{ {"001", "2015-01-01", "IT"}, {"001", "2015-01-01", "市场部"}, {"001", "2015-01-01", "IT"},
						{"002", "2015-01-02", "市场部"}, {"001", "2015-01-03", "测试"}, {"001", "2015-01-03", "测试"}};
		String[] columnName = {"单号", "申请时间", "申请部门"};
		HttpServletResponse response = null;
		new TestExportExcel().ExportTest(sheetName, titleName, fileName, columnNumber, columnWidth, columnName,
				dataList, response);
	}

	/**
	 * 
	* 方法描述：PC端—导出文件
	* 创建人：汪俊    
	* 创建时间：2016-3-16 下午05:23:40    
	* 修改人：汪俊     
	* 修改时间：2016-3-16 下午05:23:40   
	* 修改备注：    
	* @version V1.0
	 */
	public void Export(String sheetName, String titleName, String fileName, int columnNumber, int[] columnWidth,
			String[] columnName, String[][] dataList, HttpServletResponse response) throws Exception {
		if (columnNumber == columnWidth.length && columnWidth.length == columnName.length) {
			// 第一步，创建一个webbook，对应一个Excel文件
			HSSFWorkbook wb = new HSSFWorkbook();
			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			HSSFSheet sheet = wb.createSheet(sheetName);
			// sheet.setDefaultColumnWidth(15); //统一设置列宽
			for (int i = 0; i < columnNumber; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == j) {
						sheet.setColumnWidth(i, columnWidth[j] * 256); // 单独设置每列的宽
					}
				}
			}
			// 创建第0行 也就是标题
			HSSFRow row1 = sheet.createRow((int) 0);
			row1.setHeightInPoints(50);// 设备标题的高度
			// 第三步创建标题的单元格样式style2以及字体样式headerFont1
			HSSFCellStyle style2 = wb.createCellStyle();
			style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
			style2.setFillForegroundColor(HSSFColor.LIGHT_TURQUOISE.index);
			style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			HSSFFont headerFont1 = (HSSFFont) wb.createFont(); // 创建字体样式
			headerFont1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体加粗
			headerFont1.setFontName("黑体"); // 设置字体类型
			headerFont1.setFontHeightInPoints((short) 15); // 设置字体大小
			style2.setFont(headerFont1); // 为标题样式设置字体样式

			HSSFCell cell1 = row1.createCell(0);// 创建标题第一列
			sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, columnNumber - 1)); // 合并第0到第17列
			cell1.setCellValue(titleName); // 设置值标题
			cell1.setCellStyle(style2); // 设置标题样式

			// 创建第1行 也就是表头
			HSSFRow row = sheet.createRow((int) 1);
			row.setHeightInPoints(37);// 设置表头高度

			// 第四步，创建表头单元格样式 以及表头的字体样式
			HSSFCellStyle style = wb.createCellStyle();
			style.setWrapText(true);// 设置自动换行
			style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个居中格式

			style.setBottomBorderColor(HSSFColor.BLACK.index);
			style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			style.setBorderRight(HSSFCellStyle.BORDER_THIN);
			style.setBorderTop(HSSFCellStyle.BORDER_THIN);

			HSSFFont headerFont = (HSSFFont) wb.createFont(); // 创建字体样式
			headerFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体加粗
			headerFont.setFontName("黑体"); // 设置字体类型
			headerFont.setFontHeightInPoints((short) 10); // 设置字体大小
			style.setFont(headerFont); // 为标题样式设置字体样式

			// 第四.一步，创建表头的列
			for (int i = 0; i < columnNumber; i++) {
				HSSFCell cell = row.createCell(i);
				cell.setCellValue(columnName[i]);
				cell.setCellStyle(style);
			}

			// 为数据内容设置特点新单元格样式1 自动换行 上下居中
			HSSFCellStyle zidonghuanhang = wb.createCellStyle();
			zidonghuanhang.setWrapText(true);// 设置自动换行
			zidonghuanhang.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个居中格式

			// 设置边框
			zidonghuanhang.setBottomBorderColor(HSSFColor.BLACK.index);
			zidonghuanhang.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang.setBorderRight(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang.setBorderTop(HSSFCellStyle.BORDER_THIN);

			// 为数据内容设置特点新单元格样式2 自动换行 上下居中左右也居中
			HSSFCellStyle zidonghuanhang2 = wb.createCellStyle();
			zidonghuanhang2.setWrapText(true);// 设置自动换行
			zidonghuanhang2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个上下居中格式
			zidonghuanhang2.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中

			// 设置边框
			zidonghuanhang2.setBottomBorderColor(HSSFColor.BLACK.index);
			zidonghuanhang2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang2.setBorderRight(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang2.setBorderTop(HSSFCellStyle.BORDER_THIN);

			// 第五步，创建单元格，并设置值
			for (int i = 0; i < dataList.length; i++) {
				row = sheet.createRow((int) i + 2);
				HSSFCell datacell = null;
				for (int j = 0; j < columnNumber; j++) {
					datacell = row.createCell(j);
					// boolean isNum = dataList[i][j].matches("^\\d+$");
					datacell.setCellValue(dataList[i][j]);
					datacell.setCellStyle(zidonghuanhang2);
				}
			}
			// 第六步，将文件存到浏览器设置的下载位置
			String filename = fileName + ".xls";
			response.setContentType("application/ms-excel;charset=UTF-8");
			response.setHeader("Content-Disposition",
					"attachment;filename=".concat(String.valueOf(URLEncoder.encode(filename, "UTF-8"))));
			OutputStream out = response.getOutputStream();
			try {
				wb.write(out);// 将数据写出去
				String str = "导出" + fileName + "成功！";
				System.out.println(str);
			} catch (Exception e) {
				e.printStackTrace();
				String str1 = "导出" + fileName + "失败！";
				System.out.println(str1);
			} finally {
				out.close();
			}
		}
		else {
			System.out.println("列数目长度名称三个数组长度要一致");
		}
	}



	/**
	 * 
	* 方法描述：PC端—一个list拆分导出到一个表单的多个sheet里面
	* 创建人：汪俊    
	* 创建时间：2016-8-3 下午07:57:28    
	* 修改人：汪俊     
	* 修改时间：2016-8-3 下午07:57:28   
	* 修改备注：    
	* @version V1.0
	 */
	public void ExportNew(int year, int month, int sheetNameNumbers, String titleName, String fileName,
			int columnNumber, int[] columnWidth, String[] columnName, String[][] dataList, HttpServletResponse response)
			throws Exception {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = dataList[0].length - 1;
		if (columnNumber == columnWidth.length && columnWidth.length == columnName.length) {
			// Calendar cal = Calendar.getInstance();
			// int month = cal.get(Calendar.MONTH) + 1;
			// int year = cal.get(Calendar.YEAR);
			// 第一步，创建一个webbook，对应一个Excel文件
			HSSFWorkbook wb = new HSSFWorkbook();
			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			for (int i = 0; i < dataList.length; i++) {
				if (dataList[i][0].equals("合计")) {
					a = i;
					b = a;
					break;
				}
			}
			for (int m = 0; m < sheetNameNumbers; m++) {

				HSSFSheet sheet = null;
				for (int i = a; i < dataList.length; i++) {
					if (i == b) {
						sheet = wb.createSheet(dataList[b][d] + year + "年" + month + "月");
						b = 0;
						break;
					}
					else if (dataList[i + 1][0].equals("合计")) {
						c = a + 1;
						sheet = wb.createSheet(dataList[i + 1][d] + year + "年" + month + "月");
						a = i + 1;
						break;
					}
				}
				for (int i = 0; i < columnNumber; i++) {
					for (int j = 0; j <= i; j++) {
						if (i == j) {
							sheet.setColumnWidth(i, columnWidth[j] * 256); // 单独设置每列的宽
						}
					}
				}
				// 创建第0行 也就是标题
				HSSFRow row1 = sheet.createRow((int) 0);
				row1.setHeightInPoints(50);// 设备标题的高度
				// 第三步创建标题的单元格样式style2以及字体样式headerFont1
				HSSFCellStyle style2 = wb.createCellStyle();
				style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
				style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
				style2.setFillForegroundColor(HSSFColor.LIGHT_TURQUOISE.index);
				style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
				HSSFFont headerFont1 = (HSSFFont) wb.createFont(); // 创建字体样式
				headerFont1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体加粗
				headerFont1.setFontName("黑体"); // 设置字体类型
				headerFont1.setFontHeightInPoints((short) 15); // 设置字体大小
				style2.setFont(headerFont1); // 为标题样式设置字体样式

				HSSFCell cell1 = row1.createCell(0);// 创建标题第一列
				sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, columnNumber - 1)); // 合并第0到第17列
				cell1.setCellValue(titleName); // 设置值标题
				cell1.setCellStyle(style2); // 设置标题样式

				// 创建第1行 也就是表头
				HSSFRow row = sheet.createRow((int) 1);
				row.setHeightInPoints(37);// 设置表头高度

				// 第四步，创建表头单元格样式 以及表头的字体样式
				HSSFCellStyle style = wb.createCellStyle();
				style.setWrapText(true);// 设置自动换行
				style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
				style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个居中格式

				style.setBottomBorderColor(HSSFColor.BLACK.index);
				style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
				style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
				style.setBorderRight(HSSFCellStyle.BORDER_THIN);
				style.setBorderTop(HSSFCellStyle.BORDER_THIN);

				HSSFFont headerFont = (HSSFFont) wb.createFont(); // 创建字体样式
				headerFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体加粗
				headerFont.setFontName("黑体"); // 设置字体类型
				headerFont.setFontHeightInPoints((short) 10); // 设置字体大小
				style.setFont(headerFont); // 为标题样式设置字体样式

				// 第四.一步，创建表头的列
				for (int i = 0; i < columnNumber; i++) {
					HSSFCell cell = row.createCell(i);
					cell.setCellValue(columnName[i]);
					cell.setCellStyle(style);
				}

				// 为数据内容设置特点新单元格样式1 自动换行 上下居中
				HSSFCellStyle zidonghuanhang = wb.createCellStyle();
				zidonghuanhang.setWrapText(true);// 设置自动换行
				zidonghuanhang.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个居中格式

				// 设置边框
				zidonghuanhang.setBottomBorderColor(HSSFColor.BLACK.index);
				zidonghuanhang.setBorderBottom(HSSFCellStyle.BORDER_THIN);
				zidonghuanhang.setBorderLeft(HSSFCellStyle.BORDER_THIN);
				zidonghuanhang.setBorderRight(HSSFCellStyle.BORDER_THIN);
				zidonghuanhang.setBorderTop(HSSFCellStyle.BORDER_THIN);

				// 为数据内容设置特点新单元格样式2 自动换行 上下居中左右也居中
				HSSFCellStyle zidonghuanhang2 = wb.createCellStyle();
				zidonghuanhang2.setWrapText(true);// 设置自动换行
				zidonghuanhang2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个上下居中格式
				zidonghuanhang2.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中

				// 设置边框
				zidonghuanhang2.setBottomBorderColor(HSSFColor.BLACK.index);
				zidonghuanhang2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
				zidonghuanhang2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
				zidonghuanhang2.setBorderRight(HSSFCellStyle.BORDER_THIN);
				zidonghuanhang2.setBorderTop(HSSFCellStyle.BORDER_THIN);

				// 第五步，创建单元格，并设置值
				for (int i = c, l = 0; i <= a; i++, l++) {
					row = sheet.createRow((int) l + 2);
					HSSFCell datacell = null;
					for (int j = 0; j < columnNumber; j++) {
						datacell = row.createCell(j);
						datacell.setCellValue(dataList[i][j]);
						datacell.setCellStyle(zidonghuanhang2);
					}
				}
			}
			// 第六步，将文件存到浏览器设置的下载位置
			String filename = fileName + ".xls";
			response.setContentType("application/ms-excel;charset=UTF-8");
			response.setHeader("Content-Disposition",
					"attachment;filename=".concat(String.valueOf(URLEncoder.encode(filename, "UTF-8"))));
			OutputStream out = response.getOutputStream();
			try {
				wb.write(out);// 将数据写出去
				String str = "导出" + fileName + "成功！";
				System.out.println(str);
			} catch (Exception e) {
				e.printStackTrace();
				String str1 = "导出" + fileName + "失败！";
				System.out.println(str1);
			} finally {
				out.close();
			}
		}
		else {
			System.out.println("列数目长度名称三个数组长度要一致");
		}
	}

	// 动态合并行 只限第一列的数据
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void ExportTest(String sheetName, String titleName, String fileName, int columnNumber, int[] columnWidth,
			String[] columnName, String[][] dataList, HttpServletResponse response) throws Exception {
		if (columnNumber == columnWidth.length && columnWidth.length == columnName.length) {
			// 第一步，创建一个webbook，对应一个Excel文件
			HSSFWorkbook wb = new HSSFWorkbook();
			// 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
			HSSFSheet sheet = wb.createSheet(sheetName);
			// sheet.setDefaultColumnWidth(15); //统一设置列宽
			for (int i = 0; i < columnNumber; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == j) {
						sheet.setColumnWidth(i, columnWidth[j] * 256); // 单独设置每列的宽
					}
				}
			}
			// 创建第0行 也就是标题
			HSSFRow row1 = sheet.createRow((int) 0);
			row1.setHeightInPoints(50);// 设备标题的高度
			// 第三步创建标题的单元格样式style2以及字体样式headerFont1
			HSSFCellStyle style2 = wb.createCellStyle();
			style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
			style2.setFillForegroundColor(HSSFColor.LIGHT_TURQUOISE.index);
			style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			HSSFFont headerFont1 = (HSSFFont) wb.createFont(); // 创建字体样式
			headerFont1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体加粗
			headerFont1.setFontName("黑体"); // 设置字体类型
			headerFont1.setFontHeightInPoints((short) 15); // 设置字体大小
			style2.setFont(headerFont1); // 为标题样式设置字体样式

			HSSFCell cell1 = row1.createCell(0);// 创建标题第一列
			sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, columnNumber - 1)); // 合并第0到第17列
			cell1.setCellValue(titleName); // 设置值标题
			cell1.setCellStyle(style2); // 设置标题样式

			// 创建第1行 也就是表头
			HSSFRow row = sheet.createRow((int) 1);
			row.setHeightInPoints(37);// 设置表头高度

			// 第四步，创建表头单元格样式 以及表头的字体样式
			HSSFCellStyle style = wb.createCellStyle();
			style.setWrapText(true);// 设置自动换行
			style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个居中格式

			style.setBottomBorderColor(HSSFColor.BLACK.index);
			style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			style.setBorderRight(HSSFCellStyle.BORDER_THIN);
			style.setBorderTop(HSSFCellStyle.BORDER_THIN);

			HSSFFont headerFont = (HSSFFont) wb.createFont(); // 创建字体样式
			headerFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 字体加粗
			headerFont.setFontName("黑体"); // 设置字体类型
			headerFont.setFontHeightInPoints((short) 10); // 设置字体大小
			style.setFont(headerFont); // 为标题样式设置字体样式

			// 第四.一步，创建表头的列
			for (int i = 0; i < columnNumber; i++) {
				HSSFCell cell = row.createCell(i);
				cell.setCellValue(columnName[i]);
				cell.setCellStyle(style);
			}

			// 为数据内容设置特点新单元格样式1 自动换行 上下居中
			HSSFCellStyle zidonghuanhang = wb.createCellStyle();
			zidonghuanhang.setWrapText(true);// 设置自动换行
			zidonghuanhang.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个居中格式

			// 设置边框
			zidonghuanhang.setBottomBorderColor(HSSFColor.BLACK.index);
			zidonghuanhang.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang.setBorderRight(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang.setBorderTop(HSSFCellStyle.BORDER_THIN);

			// 为数据内容设置特点新单元格样式2 自动换行 上下居中左右也居中
			HSSFCellStyle zidonghuanhang2 = wb.createCellStyle();
			zidonghuanhang2.setWrapText(true);// 设置自动换行
			zidonghuanhang2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 创建一个上下居中格式
			zidonghuanhang2.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中

			// 设置边框
			zidonghuanhang2.setBottomBorderColor(HSSFColor.BLACK.index);
			zidonghuanhang2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang2.setBorderRight(HSSFCellStyle.BORDER_THIN);
			zidonghuanhang2.setBorderTop(HSSFCellStyle.BORDER_THIN);

			List lcy = new ArrayList();
			// 第五步，创建单元格，并设置值
			for (int i = 0; i < dataList.length; i++) {
				row = sheet.createRow((int) i + 2);
				HSSFCell datacell = null;
				for (int j = 0; j < columnNumber; j++) {
					datacell = row.createCell(j);
					datacell.setCellValue(dataList[i][j]);
					datacell.setCellStyle(zidonghuanhang2);
				}
				if (i >= 1) {
					if (dataList[i][0].equals(dataList[i - 1][0])) {
						// sheet.addMergedRegion(new CellRangeAddress((int) i + 2 -flag,(int) i +
						// 2,0,0));
					}
					else {
						lcy.add(i + 2);
					}
				}
				else {
					lcy.add(i + 2);
				}
			}
			if (lcy.size() == 1) {
				sheet.addMergedRegion(new CellRangeAddress(2, dataList.length + 1, 0, 0));
			}
			else if (lcy.size() == 2) {
				if (lcy.get(1).hashCode() == 3) {
					if (dataList.length + 1 - lcy.get(1).hashCode() >= 1) {
						sheet.addMergedRegion(new CellRangeAddress(3, dataList.length + 1, 0, 0));
					}
				}
				else {
					sheet.addMergedRegion(new CellRangeAddress(2, dataList.length, 0, 0));
				}
			}
			else if (lcy.size() >= 3) {
				for (int i = 1; i < lcy.size(); i++) {
					if (lcy.get(i).hashCode() - lcy.get(i - 1).hashCode() >= 1) {
						sheet.addMergedRegion(new CellRangeAddress(lcy.get(i - 1).hashCode(),
								lcy.get(i).hashCode() - 1, 0, 0));
					}
				}
				if (dataList.length + 1 - lcy.get(lcy.size() - 1).hashCode() >= 1) {
					sheet.addMergedRegion(new CellRangeAddress(lcy.get(lcy.size() - 1).hashCode(), dataList.length + 1,
							0, 0));
				}
			}
			// try
			// {
			// FileOutputStream fout = new FileOutputStream("C:/Users/lanston/Desktop/测试动态合并行.xls");
			// wb.write(fout);
			// fout.close();
			// }
			// catch (Exception e)
			// {
			// e.printStackTrace();
			// }

			// 第六步，将文件存到浏览器设置的下载位置
			String filename = fileName + ".xls";
			response.setContentType("application/ms-excel;charset=UTF-8");
			response.setHeader("Content-Disposition",
					"attachment;filename=".concat(String.valueOf(URLEncoder.encode(filename, "UTF-8"))));
			OutputStream out = response.getOutputStream();
			try {
				wb.write(out);// 将数据写出去
				String str = "导出" + fileName + "成功！";
				System.out.println(str);
			} catch (Exception e) {
				e.printStackTrace();
				String str1 = "导出" + fileName + "失败！";
				System.out.println(str1);
			} finally {
				out.close();
			}
		}
		else {
			System.out.println("列数目长度名称三个数组长度要一致");
		}
	}


}
