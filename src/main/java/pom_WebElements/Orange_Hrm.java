package pom_WebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base_Class.Base_Class;

import pom_Interface.Orange_Hrm_Interface;

public class Orange_Hrm extends Base_Class implements Orange_Hrm_Interface{
	public Orange_Hrm() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=user_Field_Name)
	private WebElement user_Name_Field;
	
	public WebElement get_User_Name_Field() {
	return user_Name_Field;
	}
	
	@FindBy(xpath=user_Field_Password)
	private WebElement user_Pass_Field;
	
	public WebElement get_User_Pass_Field() {
		return user_Pass_Field;
	}
	
	@FindBy(xpath=login_Field)
	private WebElement login_Button;
	
	public WebElement get_Login_Button() {
		return login_Button;
	}
}
