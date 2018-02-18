package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadTest {
	private WebDriver driver;

	ReadTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		driver.findElement(By.xpath("//*[@data-test-id='message-list-item']")).click();
	}
}