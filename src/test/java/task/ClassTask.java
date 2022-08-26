package task;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTask {
	public static void main(String[] args) throws IOException {
	//	WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		File file=new File("C:\\Users\\Forza\\Downloads\\task\\Excel\\classtask.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Details");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cType = c.getCellType();
				if (cType==1) {     //1 mean string
					String stringCellValue = c.getStringCellValue();
					System.out.println(stringCellValue);
				}
				if (cType==0) {  //0 mean date or no
					boolean cellFormat = DateUtil.isCellDateFormatted(c);
					if (cellFormat) {
						Date value = c.getDateCellValue();
						SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");//class to format date
						dateFormat.format(value);
						System.out.println(value);
					}
						else {
										
							double d = c.getNumericCellValue();
							long l=(long)d;
							String string = String.valueOf(l);
							System.out.println(string);
						}
									
					}
					
					
				}
				}			
		}
		
		
		
		
	}


