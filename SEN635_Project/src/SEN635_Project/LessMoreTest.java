package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessMoreTest {
	private WebDriver driver;

	LessMoreTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest()
	{
		try {
			driver.findElement(By.xpath("//*[@data-test-id='folder-list-collapse']")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@data-test-id='folder-list-expand']")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}