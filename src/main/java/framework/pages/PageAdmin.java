package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAdmin {

	
	@FindBy(id="searchSystemUser_userName")
	WebElement searchUsernameTextBox;
	
	@FindBy(id="searchBtn")
	WebElement searchButton;
	
	@FindBy(id="btnAdd")
	WebElement addUser;
	
	@FindBy(id="resultTable")
	WebElement userTable;
	
	WebDriver driver;
	
	public PageAdmin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, PageAdmin.class);
	}
	
	public WebElement searchUser(String username) {
		
		searchUsernameTextBox.sendKeys(username);
		searchButton.click();
		return userTable;
		
	}
	
	public PageUserMgmt addUserfunc() {
		addUser.click();	
		return PageFactory.initElements(driver, PageUserMgmt.class);
		
	}
	
	
	
	
	
}
