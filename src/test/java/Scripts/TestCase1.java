package Scripts;

import org.testng.annotations.Test;

import POM.SkillraryHomePage;
import POM.TestingPage;
import POM.demoSkillraryPage;
import genericLibrary.baseClass;

public class TestCase1 extends baseClass{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsBoutton();
		s.skillrarydemoappWebElement();
		utilities.childBrowser(driver);
		
		demoSkillraryPage ds = new demoSkillraryPage(driver);
		utilities.dropDown(ds.getSearchd() ,prodata.getPropertydata("coursedd"));
		TestingPage tp= new TestingPage(driver);
		utilities.scrolling(driver, tp.getFbIcon());
		tp.FbIconWebElement();
		//driver.findElement(By.xpath)
	}

}
