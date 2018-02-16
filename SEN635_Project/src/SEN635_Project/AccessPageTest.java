package SEN635_Project;

import org.openqa.selenium.WebDriver;

public class AccessPageTest {
	private WebDriver driver;

	AccessPageTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest() {
		driver.get("http://www.yahoo.com");
	}
}