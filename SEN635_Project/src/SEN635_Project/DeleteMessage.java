package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteMessage {
	private WebDriver driver;

	DeleteMessage( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest()
	{
		driver.findElement(By.xpath("//*[@data-test-id='toolbar-delete']")).click();
	}
}