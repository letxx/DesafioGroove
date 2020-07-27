package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	private By btn_login = By.cssSelector(".login");
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
	}	
	
	public void enterLogin() {
		
	driver.findElement(btn_login).click();
		
	}
	
}
