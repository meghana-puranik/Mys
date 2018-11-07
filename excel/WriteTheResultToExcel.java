package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteTheResultToExcel {
	public static void writerResultToXL(String path,int passCount,int failCount)
	{
		try
		{
		  Workbook w = WorkbookFactory.create(new FileInputStream(path));
		  w.getSheet("sheet1").getRow(1).getCell(0).setCellValue(passCount);
		  w.getSheet("sheet1").getRow(1).getCell(1).setCellValue(failCount);
		  w.write(new FileOutputStream(path));				
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test
	public void testA()
	{
		WriteTheResultToExcel.writerResultToXL("./data/Book1.xlsx", 7, 4);
	}
}
