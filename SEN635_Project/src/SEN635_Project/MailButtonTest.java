package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailButtonTest {
	private WebDriver driver;

	MailButtonTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		driver.findElement(By.xpath("//*[@id='mega-bottombar-mail']")).click();
	}
}