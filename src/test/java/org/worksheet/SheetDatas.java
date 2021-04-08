package org.worksheet;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SheetDatas extends BaseClass {
public static void main(String[] args) throws IOException, InterruptedException {
	browserLaunch();
	loadUrl("https://adactinhotelapp.com/");
	Thread.sleep(4000);
	Login log=new Login();
	WebElement username=log.getTxtusername();
	type(username, getDataFromExcel("C:\\Users\\Raj KTMrider_96\\eclipse-workspace\\WorhsheetAuto\\excelfile\\hotelBook1.xlsx", "HOTEL", 1, 0));
	WebElement userpassword=log.getTxtpassword();
	type(userpassword,getDataFromExcel("C:\\Users\\Raj KTMrider_96\\eclipse-workspace\\WorhsheetAuto\\excelfile\\hotelBook1.xlsx", "HOTEL", 1, 1));
    WebElement btnClick=log.getBtnlogin();
    btnClick.click();
    
    
    
    //Hotel search
    Search hotel=new Search();
    WebElement location=hotel.getDrLocatio();
    selectByValue(location, getDataFromExcel("C:\\Users\\Raj KTMrider_96\\eclipse-workspace\\WorhsheetAuto\\excelfile\\hotelBook1.xlsx", "HOTEL", 1, 2));
    
    WebElement hotelName=hotel.getDrHotel();
    selectByValue(hotelName,getDataFromExcel("C:\\Users\\Raj KTMrider_96\\eclipse-workspace\\WorhsheetAuto\\excelfile\\hotelBook1.xlsx", "HOTEL", 1, 3));
    
    WebElement room=hotel.getDrRoom();
    selectByValue(room, getDataFromExcel("C:\\\\Users\\\\Raj KTMrider_96\\\\eclipse-workspace\\\\WorhsheetAuto\\\\excelfile\\\\hotelBook1.xlsx", "HOTEL", 1, 4));
    WebElement finder=hotel.getSearchbtn();
     btnClick(finder);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
	
	}


