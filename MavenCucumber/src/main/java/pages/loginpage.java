package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginpage {
	
	WebDriver driver;
	
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\Selenium_Jars\\geckodriver.exe");
		 driver= new FirefoxDriver();
	}
	
	public void openLoginPage()
	{
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=kuT_3EoUibk&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5Ijoia3VUXzNFb1VpYmsiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0ODkzNTY0MCwiaWF0IjoxNjQ4OTM0NDQwLCJqdGkiOiIyNTZiNTNiMC04OGNkLTQ0ZDEtODNmOS05MTM1MjBmYmVkZjUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.nzXwNnRMkO00XoEmSS1fqnwPEAofEWioePujXnfGeJL6hCwmdcGlWr3z08W8q7jTa4WnTnJi_uMV_i9hm9lMcoxCeUGTnl3Nt99JBKnZpfvE6iZWxzGEQe_woHDWqMTYSFSEccnsuMH--MkOf_aG0LC3eID9038Kj4m15ghtNFBT4SLmM5GlaGOSN719erbwV2kn43YHXo8WZIaby8QR-rKFyMr-7yMvmTVTd_FO2r5TvoHu3VQoKGicJcC48Ty8qUzMeLHwgksuNcWJ3QQOM-DCbU8H-o4-H2Ci7YqCwD2r6oh6wkI9x-Zc4-QBoq7kfLSd6rWGzkKUo-9LKe-Ztg&preferred_environment=");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public String getTitle()
	{
		String actual = driver.getTitle();
		System.out.println(actual);
		return actual;
	}
	
	public String close()
	{
		String actual = driver.getTitle();
		System.out.println(actual);
		return actual;
	}
	
	public void enterpasswordemail(String email, String password)
	{
		driver.findElement(By.id("usernameInput-input")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void clicklogin() throws InterruptedException
	{
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
	}
	
	public String readError()
	{String actual = driver.findElement(By.id("UsernameTextField_errors-usernameInput")).getText();
	System.out.println(actual);
		return actual;
	}
	
	

}
