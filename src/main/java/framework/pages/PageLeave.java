package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageLeave {
	@FindBy(id="calFromDate")
	WebElement from;
	
	@FindBy(id="calToDate")
	WebElement to;
	
	@FindBy(xpath="//div[@id='leaveList_chkSearchFilter_checkboxgroup']/input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	WebElement checkAll;
	
	@FindBy(id="leaveList_txtEmployee_empName")
	WebElement empName;
	
	@FindBy(id="leaveList_cmbSubunit")
	WebElement subUnitSelect;
	
	WebDriver driver;
	
	public PageLeave(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, PageLeave.class);
	}
	
	public void leaveList(String fromDate,String toDate,String myEmpname,String mySubUnit) {
		from.sendKeys(fromDate);
		to.sendKeys(toDate);
		checkAll.click();
		empName.sendKeys(myEmpname);
		Select sl = new Select(subUnitSelect);
		sl.selectByVisibleText(mySubUnit);
	}
}
