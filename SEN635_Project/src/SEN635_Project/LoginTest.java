package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {
	private WebDriver driver;

	LoginTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		//U: sen635project@yahoo.com
		//P: PASSword123!
		
		try
		{
			WebElement hello = driver.findElement(By.id("login-username"));
			hello.sendKeys("sen635project");
			driver.findElement(By.xpath("//*[@id='login-signin']")).click();
			Thread.sleep(5000);

			WebElement pass = driver.findElement(By.id("login-passwd"));
			pass.sendKeys("PASSword123!");
			driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}