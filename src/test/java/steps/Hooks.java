package steps;

import baseLayer.BaseTest;
import io.cucumber.java.BeforeAll;

public class Hooks {

	@BeforeAll
	public static void beforeScenario() {
		BaseTest baseTest = new BaseTest();
		baseTest.initialization();
	}

}
