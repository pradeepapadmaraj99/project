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

public class DayOneTaskMaven {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Forza\\Downloads\\task\\Excel\\Studdetails.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Data");
		
	//*******************	TASK 1************************************//
		//**************GETTING DATA FROM EXCEL*********************//
		
/*		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
		}		*/
		
		
		
		//*****************TASK 2************************************//
		//DISP TOTAL NO OF ROWS AND CELLS***************************//
		
	/*	int rNo = s.getPhysicalNumberOfRows();
		System.out.println(rNo);
		
		Row r = s.getRow(0);
		int cNo = r.getPhysicalNumberOfCells();
		System.out.println(cNo);      */
		
		
		
		///************TASK 3******************//
		//*****************PRINTING ALL DATA IN EXCEL*******************//
		
		
		
		
		
			
	}

}
