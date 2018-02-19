package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteFolder {
	private WebDriver driver;

	DeleteFolder( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		try {
			driver.findElement(By.xpath("//*[@data-test-folder-name='Test Folder RenamedTest Folder']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@data-test-id='folder-menu-hook']")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@name='delete_folder']")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}