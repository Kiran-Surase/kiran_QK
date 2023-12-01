package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public XSSFWorkbook wb;
	public ExcelDataProvider() throws IOException {
		
		String Excelpath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(Excelpath);
		 wb=new XSSFWorkbook(fis);
	
	}

	public String getStringData_Excel(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
}
