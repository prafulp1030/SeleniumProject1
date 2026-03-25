package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseTest;

public class ContactPage extends BaseTest {

	@FindBy(xpath = "//a[@href='/contacts']")
	WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	WebElement createButton;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnContactLink() {
		this.contactLink.click();
	}

	public void clickOnCreateButton() {
		this.createButton.click();
	}
}
