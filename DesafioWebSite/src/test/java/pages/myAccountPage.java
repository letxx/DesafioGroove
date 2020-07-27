package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myAccountPage{

WebDriver driver;

private By btn_email_create = By.className("page-heading");


public myAccountPage(WebDriver driver) {
	
	this.driver = driver;
}	


public void creatAccout () {

	driver.findElement(btn_email_create).isDisplayed();
	
	driver.close();
	driver.quit();

}	

}
