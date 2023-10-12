package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	//Declaration
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusIcon;
	
	@FindBy(xpath="//button[@ondblclick='addtocart()']")
	private WebElement addtocart;
	
	//initialization
	public AddToCartPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public void addToCart()
	{
		addtocart.click();
	}
	


}
