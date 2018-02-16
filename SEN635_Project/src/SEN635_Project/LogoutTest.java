package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutTest {
	private WebDriver driver;

	LogoutTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		driver.findElement(By.xpath("//*[@data-test-id='smartview-list-item']")).click();
	}
}