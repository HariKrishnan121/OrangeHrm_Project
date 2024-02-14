package pom_WebElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base_Class.Base_Class;

import pom_Interface.Amazon_Page_Interface;

public class Amazon_page extends  Base_Class implements Amazon_Page_Interface{

	public Amazon_page() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText=mobiles_Ele)
	private WebElement mobiles;
	
	public WebElement get_Mobiles() {
		return mobiles;
	}
	
	@FindBy(xpath=search_Item_Ele)
	private WebElement search_Item;
	
	public WebElement get_Search_Box(){
		return search_Item;
	}
	
	@FindBy(xpath=search_Click_Ele)
	private WebElement search_Click_Box;
	
	public WebElement get_Search_Click_Box() {
		return search_Click_Box;
	}
	
	@FindBy(xpath=click_Samsung_Ele)
	private WebElement click_Samsung;
	
	public WebElement get_Click_Samsung() {
		return click_Samsung;
	}
	
	@FindBy(xpath=add_To_Cart_Ele)
	private WebElement add_To_Cart;
	
	public WebElement get_Add_To_Cart() {
		return add_To_Cart;
	}
	
	@FindBy(xpath=close_Cart_Ele)
	private WebElement close_Cart;
	
	public WebElement get_Close_Cart() {
		return close_Cart;
	}
	
	@FindBy(xpath=nav_To_Cart_Ele)
	private WebElement nav_To_Cart;
	
	public WebElement get_Nav_To_Cart() {
		return nav_To_Cart;
	}
	
	@FindBy(xpath=text_Contain_Ele)
	private WebElement text_Of_Cart;
	
	public WebElement get_Text_Of_Cart() {
		return text_Of_Cart;
	}
}
