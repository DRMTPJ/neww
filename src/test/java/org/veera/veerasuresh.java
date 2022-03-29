package org.veera;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class veerasuresh {
public static void main(String[] args) throws Throwable {
	File f = new File("C:\\Users\\SR\\eclipse-workspace\\veera\\Excel\\New Microsoft Excel Worksheet.xlsx");
    FileInputStream str = new FileInputStream(f);
    Workbook b = new XSSFWorkbook(str);
    Sheet sh = b.getSheet("Sheet1");
    Row r = sh.getRow(2);
    Cell ce = r.getCell(2);
    System.out.println(ce);
    
     
     
}
}
