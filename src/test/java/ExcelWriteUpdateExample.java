import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteUpdateExample {

	public static void main(String[] args) throws Throwable {
		File f= new File("C:\\Users\\Sathish cj\\Desktop\\vezha\\excelwriteexample.xlsx");//create file
		XSSFWorkbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("vezh");
		Row r=s.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("Vezha Vendan");
		
		FileOutputStream f1=new FileOutputStream(f);
		w.write(f1);
		
		/*FileInputStream f2=new FileInputStream(f);
		Workbook w1=new XSSFWorkbook(f2);
		Sheet s1= w1.getSheet("vezh");
		Row r1=s1.getRow(0);
		Cell c1=r1.getCell(0);
		int celltype=c1.getCellType();
		if (celltype==1) {
			String value=c1.getStringCellValue();
			System.out.println(value);
			if (value.equalsIgnoreCase("vezha vendan")) {
				c1.setCellValue("vezha");
				
			}
			
			
		}
		FileOutputStream f3=new FileOutputStream(f);
		w.write(f3);*/
	}

}
