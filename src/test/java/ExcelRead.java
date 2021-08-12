import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Throwable {

		File f= new File("C:\\Users\\Sathish cj\\Desktop\\vezha\\Book1.xlsx");//create file
		FileInputStream f1=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(f1); //Get workbook 
		Sheet s=w.getSheet("sheet1");//getsheet
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)   //get rows and columns
		{
			Row row=s.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell=row.getCell(j);		
				int celltype=cell.getCellType();//seperate number and characters //celltype value 0,1 //celltype
				if (celltype==1) {               //seperate characters
					String character=cell.getStringCellValue();
					System.out.println(character);
				}else
					if (celltype==0) {   //seperate numbers //numbers in date format as well as numericals seperate both numerical formats
						if (DateUtil.isCellDateFormatted(cell)) {//get date
							Date d=cell.getDateCellValue();//return type date convert it into string
							SimpleDateFormat da1=new SimpleDateFormat("mm/dd/yyyy");//convert date into string
							String date=da1.format(d);
							System.out.println(date);

						}else {
							double d=cell.getNumericCellValue();
							long d1=(long)d;
							String value=String.valueOf(d1);
							System.out.println(value);
						}
					}

			}
		}




	}

}
