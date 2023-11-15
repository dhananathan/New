package org.jv;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sheet {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\DHANANATHAN\\Downloads\\eclipse-committers\\eclipse\\Mavenn\\Excel\\Book1.xlsx");
		//excel file name.xlsx updated one 
		FileInputStream stream=new FileInputStream(f);
		
	//	XSSF is should be capital
	Workbook book=new XSSFWorkbook(stream);
	org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet("leo");	
		
		
	}

}
