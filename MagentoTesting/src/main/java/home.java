

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home {
WebDriver driver;
public home(WebDriver driver)
{
	this.driver=driver;
}
By logout=By.linkText("Log Out");
public void clickOnLogOut()
{
	driver.findElement(logout).click();
}
}
