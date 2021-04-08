package org.worksheet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends BaseClass {
	public Search() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement drLocatio;
	@FindBy(id="hotels")
	private WebElement drHotel;
	@FindBy(id="room_type")
	private WebElement drRoom;
	@FindBy(id="Submit")
	private WebElement searchbtn;
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getDrRoom() {
		return drRoom;
	}
	@FindBy(id="Submit")
	private WebElement btnlogin;
	public WebElement getDrLocatio() {
		return drLocatio;
	}
	public WebElement getDrHotel() {
		return drHotel;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}


}
