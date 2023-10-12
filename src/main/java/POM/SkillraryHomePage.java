package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//Declaration 
	// address of gears WebElement
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skillrarydemoapp
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchicon;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement coockies;

	//initialization
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void gearsBoutton() {
		gearsbtn.click();
	}
	
	public void skillrarydemoappWebElement() {
		skillrarydemoapp.click();
	}
	public void searchTextfield(String data) {
		searchTf.sendKeys(data);
	}
	
	public void serachiconWebElement() {
		searchicon.click();
	}
	
	public void coockiesIcon() {
		coockies.click();
	}
	
	
}
