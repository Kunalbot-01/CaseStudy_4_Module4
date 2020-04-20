package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class flightsPage {
	
	WebDriver driver;
	@FindBy(how=How.XPATH , using ="//input[@name='userName']") WebElement UserNameTextBox;
	@FindBy(how=How.XPATH , using ="//input[@name='password']")WebElement PasswordTextBox;
	@FindBy(how=How.XPATH , using = "//input[@name='login']" ) WebElement SigninBtn;
	
	public flightsPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
public void setUserName(String strUserName) {
	UserNameTextBox.sendKeys(strUserName);
	
}

	public void setPassword(String strPassword) {
		PasswordTextBox.sendKeys(strPassword);
	}
	public void clickSigin() {
		
		SigninBtn.click();
	}
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		String expectedPageTitle="Find a Flight: Mercury Tours:";
		return getPageTitle().contains(expectedPageTitle);
	}
	
	public void signIn(String strUserName,String strPassword) throws InterruptedException {
		
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		Thread.sleep(2000);
		this.clickSigin();
		
	}
	

}
