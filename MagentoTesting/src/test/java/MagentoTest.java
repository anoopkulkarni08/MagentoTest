

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test
	public  void MagentoTest() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		Welcome w=new Welcome(driver);
				w.clickOnMyAccount();
		login l=new login(driver);
		l.typeEmail();
		l.typePassword();
		l.clickOnLogin();
		home h=new home(driver);
		h.clickOnLogOut();
		Thread.sleep(5000);
		driver.close();
	
	}

}
