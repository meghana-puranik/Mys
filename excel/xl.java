package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//open XL file
		FileInputStream fis = new FileInputStream("./data/Book1.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		//GOTO Sheet1 -> 1st row -> 1st cell
		Cell c = w.getSheet("Sheet1").getRow(0).getCell(0);
		// get the value present in the cell and print it
		String v = c.getStringCellValue();
		System.out.println(v);
		//row count counting starts from 0
		int rc = w.getSheet("sheet1").getLastRowNum();
		System.out.println(rc);
		//cell count - counting starts from 1
		int cc = w.getSheet("sheet1").getRow(0).getLastCellNum();
		System.out.println(cc);
		//close the file
		w.close();
		

	}

}
