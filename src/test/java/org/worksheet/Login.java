package org.worksheet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
	public Login() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement txtusername;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement btnlogin;
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}	
}
