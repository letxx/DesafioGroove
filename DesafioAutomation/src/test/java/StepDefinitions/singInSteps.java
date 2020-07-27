package StepDefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.createAccountPage;
import pages.loginPage;
import pages.myAccountPage;

public class singInSteps {
	WebDriver driver = null;
	loginPage login;
	createAccountPage createAccount;
	myAccountPage myAccount;

	@Dado("^que o website foi acessado$")
	public void que_o_website_foi_acessado() throws Throwable {
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				projectPath + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@Quando("^clicar em singin$")
	public void clicar_em_singin() throws Throwable {

		login = new loginPage(driver);
		login.enterLogin();
	}

	@Quando("^realizar um cadastro$")
	public void realizar_um_cadastro() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		
		
		createAccount = new createAccountPage(driver);
		createAccount.authentication();
		createAccount.personalInformation();
	}

	@Entao("^devo acessar minha conta$")
	public void devo_acessar_minha_conta() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		myAccount = new myAccountPage(driver);
		myAccount.creatAccout();

	}

};