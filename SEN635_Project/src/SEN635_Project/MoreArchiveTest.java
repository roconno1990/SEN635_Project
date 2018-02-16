package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoreArchiveTest {
	private WebDriver driver;

	MoreArchiveTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest()
	{
		//driver.findElement(By.xpath("//*[@data-test-id='folder-list-expand']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-test-folder-name='Archive']")).click();
	}
}