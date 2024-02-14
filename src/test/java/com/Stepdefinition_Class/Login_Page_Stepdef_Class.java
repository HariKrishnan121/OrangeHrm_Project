package com.Stepdefinition_Class;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_WebElements.Orange_Hrm;

public class Login_Page_Stepdef_Class extends Base_Class{
	
	public static Orange_Hrm hrm;
	
	@Given("user launches The Browser Chrome")
	public void user_launches_the_browser_chrome() {
	   browserLaunch("chrome");
	}
	@When("user Enters the url {string}")
	public void user_enters_the_url(String string) {
	   launchUrl(string);
	}
	
	@Then("user Pass The Credentials In The field")
	public void user_pass_the_credentials_in_the_field(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> credentials = dataTable.asMaps(String.class,String.class);
	for(Map<String,String> row :credentials) {
		String username = row.get("username");
		String password = row.get("password");
		hrm= new Orange_Hrm();
		inputValues(hrm.get_User_Name_Field(), username);
		inputValues(hrm.get_User_Pass_Field(), password);
	}
	}
	@Then("user Enters The Login Button")
	public void user_enters_the_login_button() {
		clickOnWebelement(hrm.get_Login_Button());
	
	}



}
