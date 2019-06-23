package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageUserMgmt {
	
	@FindBy(id="systemUser_userType")
	WebElement userRoleSelect;
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement username;
	
	@FindBy(id="systemUser_status")
	WebElement statusSelect;
	
	@FindBy(id="btnSave")
	WebElement btnSave;
	
	WebDriver driver;
	
	public PageUserMgmt(WebDriver driver) {
		this.driver = driver;
	}
	public void addUser(String employeeName,String userRoleSelect,String username,String statusSelect) {
		Select sl;
		sl= new Select(this.userRoleSelect);
		sl.selectByVisibleText("ESS");
		this.employeeName.sendKeys(employeeName);
		this.username.sendKeys(username);
		sl = new Select(this.statusSelect);
		sl.selectByVisibleText("Enabled");
		btnSave.click();
	}

}
