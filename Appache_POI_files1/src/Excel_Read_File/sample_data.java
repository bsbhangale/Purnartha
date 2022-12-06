package Excel_Read_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class sample_data {

	public static void main(String[] args) throws IOException{
	
	/*
	
		File doc = new File ("D:\\AutomationFiles\\Automation_file_priyanka\\DOC_test1.xlsx");
	    FileInputStream fls = new FileInputStream(doc);
	
	    XSSFWorkbook wb = new XSSFWorkbook(fls);
	    
	  //  wb.getSheetName(0);
	    XSSFSheet sheet1=  wb.getSheetAt(0);
	    String data0 = sheet1.getRow(1).getCell(1).getStringCellValue();
	   
		
	    System.out.println("Excel data :"+data0);
		
	    wb.close();
	    */
	
		
		FileInputStream fis = new FileInputStream("D:\\AutomationFiles\\Automation_file_priyanka\\DOC_test1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		System.out.println(sheet.getRow(0).getCell(0));
		
		
		workbook.close();
		
		
		
		
	
	    }
	    
	}

	








