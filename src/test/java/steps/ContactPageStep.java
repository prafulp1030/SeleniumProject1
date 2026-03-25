package steps;

import io.cucumber.java.en.Given;
import pages.ContactPage;

public class ContactPageStep {

	ContactPage contactPage;

	public ContactPageStep(ContactPage contactPage) {
		this.contactPage = contactPage;

	}

	@Given("user click on contact link")
	public void user_click_on_contact_link() {

		contactPage.clickOnContactLink();
	}

	@Given("user click on create button")
	public void user_click_on_create_button() {

		contactPage.clickOnCreateButton();
	}

}
