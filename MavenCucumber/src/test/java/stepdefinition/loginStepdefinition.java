package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.loginpage;


public class loginStepdefinition {
     WebDriver driver;
     
     loginpage lp= new loginpage();
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
//		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium_Jars\\geckodriver.exe");
//		 driver= new FirefoxDriver();
//		 driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=kuT_3EoUibk&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5Ijoia3VUXzNFb1VpYmsiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0ODkzNTY0MCwiaWF0IjoxNjQ4OTM0NDQwLCJqdGkiOiIyNTZiNTNiMC04OGNkLTQ0ZDEtODNmOS05MTM1MjBmYmVkZjUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.nzXwNnRMkO00XoEmSS1fqnwPEAofEWioePujXnfGeJL6hCwmdcGlWr3z08W8q7jTa4WnTnJi_uMV_i9hm9lMcoxCeUGTnl3Nt99JBKnZpfvE6iZWxzGEQe_woHDWqMTYSFSEccnsuMH--MkOf_aG0LC3eID9038Kj4m15ghtNFBT4SLmM5GlaGOSN719erbwV2kn43YHXo8WZIaby8QR-rKFyMr-7yMvmTVTd_FO2r5TvoHu3VQoKGicJcC48Ty8qUzMeLHwgksuNcWJ3QQOM-DCbU8H-o4-H2Ci7YqCwD2r6oh6wkI9x-Zc4-QBoq7kfLSd6rWGzkKUo-9LKe-Ztg&preferred_environment=");
//		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lp.openBrowser();
		lp.openLoginPage();
	}

	@When("^title of page is \"([^\"]*)\"$")
	public void title_of_page_is(String title) throws Throwable {
		String expected= title;
		String actual = lp.getTitle();//driver.getTitle();
		//System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}

	@Then("^user entre \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_entre_and(String email, String password) throws Throwable {
//		driver.findElement(By.id("usernameInput-input")).sendKeys(email);
//		driver.findElement(By.name("password")).sendKeys(password);
		lp.enterpasswordemail(email, password);
	    
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
//		driver.findElement(By.id("signIn")).click();
//		Thread.sleep(3000);
  lp.clicklogin();
	}

	@Then("^user get error message$")
	public void user_get_error_message() throws Throwable {
		String expectederror="Please enter a username or card number without special characters.";
		String actual = lp.readError();//driver.findElement(By.id("UsernameTextField_errors-usernameInput")).getText();
		//System.out.println(actual);
		Assert.assertEquals(expectederror, actual);
	    
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
		//driver.quit();
		lp.close();
	    
	}


	
}

