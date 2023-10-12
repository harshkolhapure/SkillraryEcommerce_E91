package Scripts;

import org.testng.annotations.Test;

import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import POM.demoSkillraryPage;
import genericLibrary.baseClass;

public class TestCase2 extends baseClass {
	
	@Test
	public void ts2()
	{
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsBoutton();
		s.serachiconWebElement();
		
		utilities.childBrowser(driver);
		demoSkillraryPage ds = new demoSkillraryPage(driver);
		
		ds.feedbackButton();
		DownloadInvoicePage dI= new DownloadInvoicePage(driver);
		dI.downloadInvoiceWebElement();    
		
	}
	

}
