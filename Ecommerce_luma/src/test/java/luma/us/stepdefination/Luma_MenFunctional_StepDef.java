package luma.us.stepdefination;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import luma.us.basepage.BasePage;

import luma.us.pagefactory.LoginLuma_PF;

public class Luma_MenFunctional_StepDef extends BasePage {
	//LoginLumaELM --- its connect from element class
	LoginLuma_PF pf;
	
	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {
	
	    pf = PageFactory.initElements(driver, LoginLuma_PF.class);
	    pf.getLogin();
	}
	@When("User should be able to select Jupiter All-Weather Trainer jacket from men module")
	public void user_should_be_able_to_select_jupiter_all_weather_trainer_jacket_from_men_module() {
	   
	    
	}
	@When("Verify the jacket name on the Jupiter All-Weather Trainer list")
	public void verify_the_jacket_name_on_the_jupiter_all_weather_trainer_list() {
	   
	    
	}
	@When("User should be able to select the M and Blue and {int} then click on the add to cart")
	public void user_should_be_able_to_select_the_m_and_blue_and_then_click_on_the_add_to_cart(Integer int1) {
	   
	    
	}
	@When("User should be able to click on the cart and checkout")
	public void user_should_be_able_to_click_on_the_cart_and_checkout() {
	   
	    
	}
	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
	   
	    
	}
	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {
	   
	    
	}
	@Then("User should be able to verify the order number and get text on the screen “Thank you for your purchase!”")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen_thank_you_for_your_purchase() {
	   
	    
	}

}
