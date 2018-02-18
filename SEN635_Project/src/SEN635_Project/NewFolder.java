package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewFolder {
	private WebDriver driver;

	NewFolder( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		try {
			driver.findElement(By.xpath("//*[@data-test-id='icon-btn-add']")).click();
			WebElement message = driver.findElement(By.xpath("//*[@aria-label='Enter folder name [Press enter to create folder]']"));
			message.sendKeys("Test Folder");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@data-test-id='icon-btn-enter']")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}