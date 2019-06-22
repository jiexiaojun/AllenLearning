package slpcb;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
* 项目名称：testClass        
* 类名称：ExcelReader    
* 类描述：读取excel中数据，用于批量插入
* 创建人：汪俊   
* 创建时间：2017-8-14 下午04:06:09    
* 修改人：汪俊  
* 修改时间：2017-8-14 下午04:06:09   
* 修改备注：    
* @version 1.0
 */
public class TestReadExcelData {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/Users/lanston/Desktop/test.xls");
		String[][] result = getData(file, 1);
		int rowLength = result.length;
		Map<String, Object> params = new HashMap<String, Object>();
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < result[i].length; j++) {
				switch (j) {
				case 0:
					params.put("字段一", result[i][j]);
				case 1:
					params.put("字段二", result[i][j]);
				case 2:
					params.put("字段三", result[i][j]);
				case 3:
					params.put("字段四", result[i][j]);
				case 4:
					params.put("字段五", result[i][j]);
				case 6:
					params.put("字段六", result[i][j]);
				}
			}
			// 一个插入语句
		}
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * 读取Excel的内容，第一维数组存储的是一行中各列的值，二维数组存储的是多少个行
	 * @param file
	 * 读取数据的源Excel
	 * @param ignoreRows
	 * 读取数据忽略的行数，比喻行头不需要读入 忽略的行数为1
	 * @return 读出的Excel中数据的内容
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@SuppressWarnings("deprecation")
	public static String[][] getData(File file, int ignoreRows)
			throws FileNotFoundException, IOException {
		List<String[]> result = new ArrayList<String[]>();
		int rowSize = 0;
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
		// 打开HSSFWorkbook
		POIFSFileSystem fs = new POIFSFileSystem(in);
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFCell cell = null;
		for(int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) 
		{
			HSSFSheet st = wb.getSheetAt(sheetIndex);
			// 第一行为标题，不取
			for(int rowIndex = ignoreRows; rowIndex <= st.getLastRowNum(); rowIndex++) 
			{
				HSSFRow row = st.getRow(rowIndex);
				if (row == null) 
				{
					continue;
				}
				int tempRowSize = row.getLastCellNum();
				if (tempRowSize > rowSize) 
				{
					rowSize = tempRowSize;
				}
				String[] values = new String[rowSize];
				Arrays.fill(values, "");
				boolean hasValue = false;
				for(short columnIndex = 0; columnIndex < row.getLastCellNum(); columnIndex++)
				{
					String value = "";
					cell = row.getCell(columnIndex);
					if (cell != null) 
					{
						// 注意：一定要设成这个，否则可能会出现乱码
						// ((Object)
						// cell).setEncoding(HSSFCell.ENCODING_UTF_16);
						switch (cell.getCellType()) 
						{
							case HSSFCell.CELL_TYPE_STRING:
							value = cell.getStringCellValue();
							break;
							case HSSFCell.CELL_TYPE_NUMERIC:
							if (HSSFDateUtil.isCellDateFormatted(cell)) 
							{
								Date date = cell.getDateCellValue();
								if (date != null) 
								{
									value = new SimpleDateFormat("yyyy-MM-dd").format(date);
								} else 
								{
									value = "";
								}
							} else 
							{
								value = new DecimalFormat("0").format(cell.getNumericCellValue());
							}
							break;
							case HSSFCell.CELL_TYPE_FORMULA:
							// 导入时如果为公式生成的数据则无值
							if (!cell.getStringCellValue().equals("")) 
							{
								value = cell.getStringCellValue();
							} else 
							{
								value = cell.getNumericCellValue() + "";
							}
							break;
							case HSSFCell.CELL_TYPE_BLANK:
							break;
							case HSSFCell.CELL_TYPE_ERROR:
							value = "";
							break;
							case HSSFCell.CELL_TYPE_BOOLEAN:
							value = (cell.getBooleanCellValue() == true ? "Y":"N");
							break;
							default:
							value = "";
						}
					}
					if (columnIndex == 0 && value.trim().equals("")) 
					{
						break;
					}
					values[columnIndex] = rightTrim(value);
					hasValue = true;
				}

				if (hasValue) 
				{
					result.add(values);
				}
			}
		}
		in.close();
		String[][] returnArray = new String[result.size()][rowSize];
		for (int i = 0; i < returnArray.length; i++) 
		{
			returnArray[i] = (String[]) result.get(i);
		}
		return returnArray;
	}

	/**
	 * 去掉字符串右边的空格
	 * @param str 要处理的字符串
	 * @return 处理后的字符串
	 */
	public static String rightTrim(String str) {
		if (str == null) 
		{
			return "";
		}
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) 
		{
			if (str.charAt(i) != 0x20) 
			{
				break;
			}
			length--;
		}
		return str.substring(0, length);
	}
}