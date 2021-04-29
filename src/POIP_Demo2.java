import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIP_Demo2 {

	public static void main(String[] args) throws IOException {
		
		String filepath = "src//ExcelXLSX.xlsx";
		
		File f1 = new File(filepath);
		
		FileInputStream fis1 = new FileInputStream(f1);
		
		Workbook workbook =null;
		
		if (filepath.endsWith(".xls"))
				{
			workbook = new HSSFWorkbook(fis1);
				}
		else
		{
			workbook = new XSSFWorkbook(fis1);
		}
		
		Sheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		
		String str = cell.getStringCellValue();
		
		System.out.println(str);
		
		workbook.close();
		

	}

}
