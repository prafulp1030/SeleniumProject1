package steps;

import baseLayer.BaseTest;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() {
		BaseTest baseTest = new BaseTest();
		baseTest.initialization();
	}

}
