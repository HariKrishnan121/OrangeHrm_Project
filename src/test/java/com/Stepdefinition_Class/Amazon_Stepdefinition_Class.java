package com.Stepdefinition_Class;

import com.Base_Class.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pom_WebElements.Amazon_page;

public class Amazon_Stepdefinition_Class extends Base_Class {

	public static Amazon_page am_Page;

	@Given("user Launches The  Chrome Browser")
	public void user_launches_the_chrome_browser() {
		browserLaunch("chrome");
	}

	@When("user Enters The url {string}")
	public void user_enters_the_url(String string) {
		launchUrl(string);
		screenShot("Amazon");
	}

	@Then("user Will Be Navigated To The Aamazon Web Page Verify Title")
	public void user_will_be_navigated_to_the_aamazon_web_page_verify_title() {
		String Actual_Title = getTitle();
		String Expected_Title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals("page title match the expected title", Actual_Title, Expected_Title);
	}

	@Then("user Navigates To The Mobile Page")
	public void user_navigates_to_the_mobile_page() {
		am_Page = new Amazon_page();
		clickOnWebelement(am_Page.get_Mobiles());
	}

	@Then("user Enters Samsung In The Text Search Box")
	public void user_enters_samsung_in_the_text_search_box() {
		am_Page = new Amazon_page();
		inputValues(am_Page.get_Search_Box(), "samsung");
		am_Page = new Amazon_page();
		clickOnWebelement(am_Page.get_Search_Click_Box());
	}

	@Then("user Selects Samsung M04 Mobile In The Result")
	public void user_selects_samsung_m04_mobile_in_the_result() {
		am_Page = new Amazon_page();
		clickOnWebelement(am_Page.get_Click_Samsung());
	}

	@Then("user Adds It To The Cart")
	public void user_adds_it_to_the_cart() {
		String text = "Samsung Galaxy M04 Dark Blue, 4GB RAM, 64GB Storage";
		windowHandling(text);
	}

	@Then("user Goes To The Cart To Verify That The Product Has Been Added Or Not")
	public void user_goes_to_the_cart_to_verify_that_the_product_has_been_added_or_not() {
		am_Page = new Amazon_page();
		clickOnWebelement(am_Page.get_Add_To_Cart());
		clickOnWebelement(am_Page.get_Close_Cart());
        clickOnWebelement(am_Page.get_Nav_To_Cart());
        String actual_Text = getAText(am_Page.get_Text_Of_Cart());
		String exp_Text = "Samsung Galaxy M04 Dark Blue, 4GB RAM, 64GB Storage | Upto…";
		//SoftAssert asrt = new SoftAssert(); 
		Assert.assertEquals("This should get pass", actual_Text, exp_Text);
		screenShot("After the product moved to the cart");

	}

	@Then("user Close The Browser")
	public void user_close_the_browser() {
		exit();
	}

}
