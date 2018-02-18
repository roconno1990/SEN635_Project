package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelTest {
	private WebDriver driver;

	TravelTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest()
	{
		driver.findElement(By.xpath("//*[@data-test-smartview-type='TRAVEL']")).click();
	}
}