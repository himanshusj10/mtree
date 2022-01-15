package com.myPractice.mtree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.parser.ParseException;

public class apac {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static Row row;
	public static Cell cell;
	public static JsonI jor = new JsonI();

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		try {
		FileInputStream excel = new FileInputStream("D:\\Users\\XY59005\\Desktop\\Keyword_Regression1_bkp.xlsx");
        wb = new XSSFWorkbook (excel);
        sh = wb.getSheet("Keywords");
        //int j=0;
        for (int i=0;i<999;i++) {
        	
         cell= sh.getRow(1).getCell(i);
         String cellData = cell.getStringCellValue();
         System.out.print(cellData + " ");
         String res =  cellData;
         String[] res1 = res.split("_");
        for (int m=0; m<res1.length;m++) {
        	System.out.println(res1[m]);
        }
         //j++;
        }
		}
		catch (Exception e) {
			System.out.println("An exception occured");
		}
		
		String res = jor.demo();
		String res1 = jor.dem();
		System.out.println("     "+ res+"     "+ res1);
        
	}

}
