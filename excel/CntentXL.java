//Write a scrip to print content of excel Sheet
package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CntentXL {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./data/Book1.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		
				int rc = w.getSheet("sheet1").getLastRowNum();
		
				for(int i=0;i<=rc;i++)
				{
					int cc = w.getSheet("sheet1").getRow(i).getLastCellNum();
					for(int j=0;j<cc;j++)
					{
				     String v = w.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				     System.out.print(v+" ");
					}
					System.out.println();
				}
		w.close();

	}

}
