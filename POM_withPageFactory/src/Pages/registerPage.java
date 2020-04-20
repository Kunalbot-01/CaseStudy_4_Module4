package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage {
	
	WebDriver driver;
	
	@FindBy(name ="firstName") WebElement FirstName;
    @FindBy(name="lastName") WebElement LastName;
    @FindBy(name="phone")WebElement Phone;
    @FindBy(name="userName")WebElement email;
    @FindBy(name="address1")WebElement Address;
    @FindBy(id="email")WebElement Uname;
    @FindBy(name="password")WebElement pwd;
    @FindBy(name="confirmPassword")WebElement CPassword;
    @FindBy(name="register")WebElement Submitbtn;
	
	public registerPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void setFName(String StrFName) {
		
		FirstName.sendKeys(StrFName);
		}
	
	public void setLastName(String strLname) {
		LastName.sendKeys(strLname);
	}
	
	public void setPhone(String strPhone)
	{Phone.sendKeys(strPhone);}
	
	
	public void setEmail(String strEmail) {
		email.sendKeys(strEmail);
	}
	public void setAddress(String strAddress) {
		Address.sendKeys(strAddress);
	}
	public void setUserName(String strUName) {
		Uname.sendKeys(strUName);
	}
	public void setPassword(String strPwd) {
		pwd.sendKeys(strPwd);
	}
	public void setCPassword(String strCPwd) {
		CPassword.sendKeys(strCPwd);
	}
	
	public void clickSubmit() {
		Submitbtn.click();
	}
	
	public void signupBlock1(String strFName,String strLname,String strPhone,String strEmail) {
		this.setFName(strFName);
		this.setLastName(strLname);
		this.setPhone(strPhone);
		this.setEmail(strEmail);
			
	}

	public void signupBlock2(String strAddress,String strUName,String Password,String CPassword)
	{
		this.setAddress(strAddress);
		this.setUserName(strUName);
		this.setPassword(Password);
		this.setCPassword(CPassword);
		this.clickSubmit();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
