package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InboxTest {
	private WebDriver driver;

	InboxTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		driver.findElement(By.xpath("//*[@data-test-id='folder-list-item']")).click();
	}
}