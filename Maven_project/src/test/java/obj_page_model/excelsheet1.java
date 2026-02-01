package obj_page_model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelsheet1 {

	public static void main(String[] args) throws IOException {
		
		String prjpath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(prjpath + "/Excel/hello.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
	System.out.println(sheet.getLastRowNum());
	System.out.println(sheet.getRow(1).getCell(0).getNumericCellValue());
	System.out.println(sheet.getRow(1).getCell(1).getNumericCellValue());
	
	sheet.getRow(5).createCell(2).setCellValue("FAIL");
	FileOutputStream fout = new FileOutputStream(prjpath+ "/Excel/hello.xlsx");
	wb.write(fout);
	wb.close();
	
	}

	}


