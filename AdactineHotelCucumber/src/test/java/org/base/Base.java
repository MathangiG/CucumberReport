package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver; 

	public void getDriveer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void getUrl(String url) {
		driver.get(url);
	}

//	public String getFileDatas(int r, int j) throws IOException {
//		File file = new File("C:\\Users\\Sankar Muthumani\\eclipse-workspace\\FrameWorkTasks\\TestData\\AdactinDatas.xlsx");
//		FileInputStream fileInputStream = new FileInputStream(file);
//		Workbook workbook = new XSSFWorkbook(fileInputStream);
//		Sheet sheet = workbook.getSheet("sheet1");
//		String  data = "";
//		Row row = sheet.getRow(r);
//		Cell cell = row.getCell(j);
//		int cellType = cell.getCellType();
//		if(cellType == 1) {
//			data = cell.getStringCellValue();
//		}
//		else if(DateUtil.isCellDateFormatted(cell)) {
//			Date date = cell.getDateCellValue();
//			SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
//			data = dateFormat.format(date);					
//		}
//		else {
//			double numericCellValue = cell.getNumericCellValue();
//			long l = (long) numericCellValue;
//			data = String.valueOf(l);
//		}
//		return data;
//	}
//
//	public static String writeExceldata(int row,int cell, String data) throws IOException {
//
//		File f =new File("C:\\Users\\admin\\Desktop\\eclipse-workspace29-7-2021\\frameworktest\\ExcelFile\\Adactin.xlsx");
//		FileInputStream fs= new FileInputStream(f);
//		Workbook w= new XSSFWorkbook(fs);
//		Sheet sheet = w.getSheet("Sheet1");
//		Row row1 = sheet.getRow(row);
//		Cell createCell = row1.createCell(cell);
//		createCell.setCellValue(data);			
//		FileOutputStream out =new FileOutputStream(f);
//		w.write(out);	
//		System.out.println("done");
//		return data;
//	}



public static void entertext(WebElement element,String data) {

	element.sendKeys(data);

}
public void dropDown(WebElement s1,String s2) {
	Select s = new Select(s1);
	s.selectByVisibleText(s2);
}
public void btnClick(WebElement element) {
	element.click();
}

}
