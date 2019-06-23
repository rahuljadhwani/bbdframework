package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageDashboard {
	@FindBy(xpath="//a[@href='/index.php/leave/assignLeave']")
	public WebElement assignLeave;
	
	@FindBy(xpath="a//[@href='/index.php/leave/viewLeaveList']")
	public WebElement viewLeaveList;
	
	@FindBy(xpath="//a[@href='/index.php/time/viewEmployeeTimesheet']")
	public WebElement viewEmployeeTimesheet;
	
	WebDriver driver;
	public PageDashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, PageDashboard.this);
	}
	
	
	public void gotoAssignLeave() {
		assignLeave.click();
	}
	
	public void gotoLeaveList() {
		viewLeaveList.click();
	}
	
	public void gotoTimeSheets() {
		viewEmployeeTimesheet.click();
	}
	
}
