package luma.us.generics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.us.basepage.BasePage;

public class WaitHelper extends BasePage {
	
	public static void seleniumWait(WebElement ele,long time) {
		WebDriverWait wait = new WebDriverWait(driver,time); // Explecit wait will work except list of webeElement
		wait.until(ExpectedConditions.elementToBeClickable(ele));

}
	}
