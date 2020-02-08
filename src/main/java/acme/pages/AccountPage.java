package acme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.pages.CreateLeadPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class AccountPage extends ProjectSpecificMethods {
	
	public AccountPage(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement username;

	public AccountPage enterUName(String email){
		clearAndType(username, email);
		return this;
	}
		
	@FindBy(how=How.ID,using="password")
	private WebElement password;

	public AccountPage enterPw(String pw){
		clearAndType(password, pw);
		return this;
	}
	
	@FindBy(how=How.ID,using="buttonLogin")
	private WebElement login;

	public Homepage clicklogin(){
		click(login);
		return new Homepage(driver, node, node);
	}
	
	
}
