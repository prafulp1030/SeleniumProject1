package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseTest;

public class LoginPage extends BaseTest {

	@FindBy(name = "email")
	WebElement username;

	public LoginPage() {
		System.out.println("Constructor...");
		PageFactory.initElements(driver, this);
	}
	
	

	public void enterUsername(String username) {
		this.username.sendKeys(username);
	}
}
