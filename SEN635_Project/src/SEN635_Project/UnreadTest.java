package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnreadTest {
	private WebDriver driver;

	UnreadTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		driver.findElement(By.xpath("//*[@data-test-id='smartview-list-item']")).click();
	}
}