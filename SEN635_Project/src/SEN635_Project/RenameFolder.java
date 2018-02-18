package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RenameFolder {
	private WebDriver driver;

	RenameFolder( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		try {
			driver.findElement(By.xpath("//*[@data-test-id='folder-menu-hook']")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@name='rename_folder']")).click();
			Thread.sleep(1000);

			WebElement message = driver.findElement(By.xpath("//*[@aria-label='Enter folder name [Press enter to rename folder]']"));
			message.sendKeys("Test Folder Renamed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}