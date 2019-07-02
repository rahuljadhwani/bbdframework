package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {
	@FindBy(xpath="//input[@id='txtUsername']")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement signInBtn;
	
	public PageLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void doLogin(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		
		this.signInBtn.click();
	}
	
}
