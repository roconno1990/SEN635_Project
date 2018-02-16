package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DraftTest {
	private WebDriver driver;

	DraftTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {

		driver.findElement(By.xpath("//*[@data-test-folder-name='Draft']")).click();
	}
}