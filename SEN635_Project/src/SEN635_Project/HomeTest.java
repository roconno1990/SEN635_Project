package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeTest {
	private WebDriver driver;

	HomeTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		driver.findElement(By.xpath("//*[@aria-label='Yahoo Home']")).click();
	}
}