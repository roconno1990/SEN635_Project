package SEN635_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CouponTest {
	private WebDriver driver;

	CouponTest( WebDriver driverIn ) {
		driver = driverIn;
	}

	public void runTest()
	{
		driver.findElement(By.xpath("//*[@data-test-smartview-type='COUPONS']")).click();
	}
}