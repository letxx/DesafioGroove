package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createAccountPage {

	WebDriver driver;
	

	private By btn_email_create = By.id("email_create");
	private By btn_submit_create = By.id("SubmitCreate");	
	
	
	private By rad_Title = By.id("id_gender2");
	private By lbl_first_name = By.id("customer_firstname");
	private By lbl_lastname = By.id("customer_lastname");
	private By lbl_passwd = By.id("passwd");
	private By lbl_days = By.id("days");
	private By lbl_months = By.id("months");
	private By lbl_years = By.id("years");
	private By chk_newsletter = By.id("customer_firstname");
	private By chk_optin = By.id("optin");
	private By lbl_address_company = By.id("company");
	private By lbl_address_address1 = By.id("address1");
	private By lbl_address_city = By.id("city");
	private By lbl_address_id_state = By.id("id_state");
	private By lbl_address_postcode = By.id("postcode");
	private By lbl_address_id_country = By.id("id_country");
	private By lbl_address_phone = By.id("phone");
	private By lbl_address_phone_mobile = By.id("phone_mobile");
	private By btn_submitAccount = By.id("submitAccount");
	
	
public createAccountPage(WebDriver driver) {
		
		this.driver = driver;
	}	

public void authentication () {
	
	driver.findElement(btn_email_create).sendKeys("eipu143126@cuwy.com");
	driver.findElement(btn_submit_create).click();
	
	
	}	
	
	public void personalInformation () {
		 
		driver.findElement(rad_Title).click();
		driver.findElement(lbl_first_name).sendKeys("Gita");
		driver.findElement(lbl_lastname).sendKeys("Nouza");
		driver.findElement(lbl_passwd).sendKeys("123qwer");
		driver.findElement(lbl_days).sendKeys("10");
		driver.findElement(lbl_months).sendKeys("May");
		driver.findElement(lbl_years).sendKeys("2000");
		driver.findElement(lbl_first_name).sendKeys("Gita");
		driver.findElement(lbl_lastname).sendKeys("Nouza");
		driver.findElement(lbl_passwd).sendKeys("123qwer");
		driver.findElement(lbl_days).sendKeys("10");
		driver.findElement(lbl_months).sendKeys("12");
		driver.findElement(chk_newsletter).click();
		driver.findElement(chk_optin).click();
		driver.findElement(lbl_address_company).sendKeys("Abc LTDA");
		driver.findElement(lbl_address_address1).sendKeys("Quadra 409 Norte ");
		driver.findElement(lbl_address_company).sendKeys("Alameda 16");
		driver.findElement(lbl_address_city).sendKeys("Palmas");
		driver.findElement(lbl_address_id_state).sendKeys("Alaska");
		driver.findElement(lbl_address_postcode).sendKeys("12345");
		driver.findElement(lbl_address_id_country).sendKeys("TO");
		driver.findElement(lbl_address_phone).sendKeys("1588864145");
		driver.findElement(lbl_address_phone_mobile).sendKeys("11988144425");
		driver.findElement(btn_submitAccount).click();
		
		}

	
}
