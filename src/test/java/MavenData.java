import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenData
{
	public static void main(String[] args) throws IOException {
	
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Mavenday1\\excel data\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	
	  Sheet sheet = workbook.getSheet("Sheet1");
	  
	  for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		
		for (int j = 0; j <  row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
		
	  int cellType = cell.getCellType();
		  
	if (cellType==1) {
		String s = cell.getStringCellValue();
		System.out.println(s);
	}
	else if (DateUtil.isCellDateFormatted(cell)) {
		java.util.Date d = cell.getDateCellValue();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-mm-yyyy");
		String f = dateformat.format(d);
	}
	else {
		double numericCellValue = cell.getNumericCellValue();
		long l = (long) numericCellValue;
		String valueOf = String.valueOf(l);
		System.out.println(valueOf);	
	}
	
		}
		
		}
	}  
	  
}
