package steps;

import baseLayer.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginStep {

	LoginPage loginPage;
	BaseTest baseTest;

	public LoginStep(BaseTest baseTest, LoginPage loginPage) {
		this.baseTest = baseTest;
		this.loginPage = loginPage;

	}

	@Given("user is on login Page")
	public void user_is_on_login_page() {

		baseTest.openUrl();
	}

	@Given("user enter username")
	public void user_enter_username() {

		loginPage.enterUsername("prafulp1010@gmail.com");
	}

}
