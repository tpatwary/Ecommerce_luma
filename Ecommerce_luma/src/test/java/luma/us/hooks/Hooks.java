package luma.us.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.us.basepage.BasePage;

public class Hooks extends BasePage {
	@Before
	public void getSetUp() {
		BasePage.Broswer_initializations();
	}
@After
	public void tearDown() {
		//driver.quit();
	}

}
