package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlwrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/Book1.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		//Cell c = w.getSheet("sheet1").getRow(0).getCell(0);
		//c.setCellValue("Meghana");
		Cell c = w.getSheet("sheet1").getRow(1).getCell(1);
		String v= c.toString();
		System.out.println(v);
		//w.write(new FileOutputStream("./data/Book2.xlsx"));
//if path is different --> Save As
		//NOTE: to read data from cell of
	}

}
