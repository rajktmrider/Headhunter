package org.worksheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raj KTMrider_96\\eclipse-workspace\\WorhsheetAuto\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
		
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void selectByVisibleText(WebElement element,String data) {
		new Select(element).selectByVisibleText(data);
	}
	public static void selectByValue(WebElement element,String data) {
		new Select(element).selectByValue(data);
}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	public static String getDataFromExcel(String pathName,String name,int rownum,int cellnum) throws IOException {
		File file=new File("C:\\Users\\Raj KTMrider_96\\eclipse-workspace\\WorhsheetAuto\\excelfile\\hotelBook1.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(fileInputStream);
		Sheet sheet = book.getSheet(name);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType=cell.getCellType();
		String value="";
		if(cellType==1) {
			value=cell.getStringCellValue();
		}else if(DateUtil.isCellDateFormatted(cell)){
			Date dateCellValue=cell.getDateCellValue();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mmm-yyyy");
			dateFormat.format(dateCellValue);
	}else {
		double numericCellValue = cell.getNumericCellValue();
	long l=(long)numericCellValue;
	 value = String.valueOf(l);
	}
		return value;
		
	}
}



































