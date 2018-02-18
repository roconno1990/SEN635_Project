package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReplyTest {
	private WebDriver driver;

	ReplyTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		
		try {
			driver.findElement(By.xpath("//*[@data-kind='reply']")).click();
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