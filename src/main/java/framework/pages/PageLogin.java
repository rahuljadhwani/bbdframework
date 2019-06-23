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
	
	WebDriver driver;
	
	public PageLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, PageLogin.class);
	}
	public void doLogin(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		
		this.signInBtn.click();
	}
	
}
