package luma.us.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.us.basepage.BasePage;
import luma.us.generics.CommonUtilities;
import luma.us.generics.WaitHelper;

public class LoginLuma_PF extends BasePage {

	// How I can initialize pagefactory concept?

	public LoginLuma_PF() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickSignInBTN;

	public WebElement GetClickSignInBTN() {
		return clickSignInBTN;

	}

	// ------
	@FindBy(xpath = "//input[@id = 'email']")
	@CacheLookup
	private WebElement EnterEmail;

	public WebElement GetEnterEmail() {
		return EnterEmail;

	}

	// --------
	@FindBy(xpath = "(//input[@id = 'pass'])[1]")
	@CacheLookup
	private WebElement EnterPassword;

	public WebElement GetEnterPassword() {
		return EnterPassword;

	}

	// ------
	@FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickLogInBTN;

	public WebElement GetClickLogInBTN() {
		return clickLogInBTN;

	}

	// Log in Functionality method
	/*
	 * public void getLogin() { GetClickSignInBTN().click();
	 * GetEnterEmail().sendKeys(prop.getProperty("Email"));
	 * GetEnterPassword().sendKeys(prop.getProperty("Password"));
	 * GetClickLogInBTN().click();
	 * 
	 * }
	 */

	public void getLogin() {
		log.info("User able to click on SignIn Button");
		WaitHelper.seleniumWait(GetClickSignInBTN(), 30);
		CommonUtilities.getActionClick(GetClickSignInBTN());
		log.info("User able to enter Email address");
		WaitHelper.seleniumWait(GetEnterEmail(), 30);
		GetEnterEmail().sendKeys(prop.getProperty("Email"));
		log.info("User able to enter Password");
		WaitHelper.seleniumWait(GetEnterPassword(), 30);
		GetEnterPassword().sendKeys(prop.getProperty("Password"));
		log.info("User able to click on LogIn Button");
		WaitHelper.seleniumWait(GetClickLogInBTN(), 30);
		CommonUtilities.getActionClick(GetClickLogInBTN());
		

	}
}
