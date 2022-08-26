package task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//**************INCOMPLETE*********************//

public class TaskSix {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		File file =new File("C:\\Users\\Forza\\Downloads\\task\\Excel\\emailPwd.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Gmail");
		Row r = s.getRow(0);
		Cell c1 = r.getCell(0);
		Cell c2 = r.getCell(1);
		driver.get("https://www.facebook.com/");
		
		
		
		
	}

}
