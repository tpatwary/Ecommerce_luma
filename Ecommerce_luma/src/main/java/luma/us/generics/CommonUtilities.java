package luma.us.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import luma.us.basepage.BasePage;

public class CommonUtilities extends BasePage {
	
	// Actions class click functionality 
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();;
	}

}
