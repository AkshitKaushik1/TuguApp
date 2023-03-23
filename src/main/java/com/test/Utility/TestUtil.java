package com.test.Utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;





public class TestUtil {
	
	
	public static String datasheet = "‪C:\\Users\\akshi\\OneDrive\\Desktop\\image.xlsx";
	static XSSFWorkbook book;
	static XSSFSheet  sheet;
	
	

	
	  @DataProvider(name ="data") public static Object[][] getTestData() throws
	  IOException {
	  
	  
	  FileInputStream file = new FileInputStream(datasheet); 
	  book = new XSSFWorkbook(file);
	  
	  sheet = book.getSheetAt(0); 
	
				 int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
			        int columnCount = sheet.getRow(0).getLastCellNum();

			        Object[][] data = new Object[rowCount][columnCount];

			      /*  for (int i = 0; i < rowCount; i++) {
			            Row row = sheet.getRow(i);
			            for (int j = 0; j < columnCount; j++) {
			                Cell cell = row.getCell(j);
			                data[i][j] = cell.toString();
			book.close();
			file.close();
			            }}
			
	  		
			 return data; }}*/
	 
	/*
			        for (int i = 0; i < rowCount; i++) {
			            Row row = sheet.getRow(i);
			            for (int j = 0; j < columnCount; j++) {
			                Cell cell = row.getCell(j);
			                data[i][j] = cell.toString();
			            }
			        }
			        
			        book.close();
			        file.close();

			        return data;
			    }}*/


			        for (int i = 0; i < rowCount; i++) {
			            Row row = sheet.getRow(i);
			            for (int j = 0; j < columnCount; j++) {
			                Cell cell = row.getCell(j);
			                if (cell != null) {
			                    data[i][j] = cell.toString();
			                } else {
			                    data[i][j] = "";
			                }
			            }
			        }

			        book.close();
			        file.close();

			        return data;
			    }}
