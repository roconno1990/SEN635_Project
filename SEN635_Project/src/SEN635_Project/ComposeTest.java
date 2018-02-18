package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComposeTest {
	private WebDriver driver;

	ComposeTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		try {
			driver.findElement(By.xpath("//*[@data-test-id='compose-button']")).click();
			WebElement to = driver.findElement(By.id("message-to-field"));
			to.sendKeys("sen635project@yahoo.com");
			Thread.sleep(5000);

			WebElement subject = driver.findElement(By.xpath("//*[@data-test-id='compose-subject']"));
			subject.sendKeys("Testing");
			Thread.sleep(5000);

			WebElement message = driver.findElement(By.xpath("//*[@data-test-id='rte']"));
			message.sendKeys("Blah Blah Blah Blah");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@data-test-id='compose-send-button']")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}