package SEN635_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEN635_Project {
	
	public static void main(String[] args) {
		String exePath = "/home/ryan/eclipse-workspace/SEN635_Project/bin/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();

		try
		{
			AccessPageTest access = new AccessPageTest(driver);
			access.runTest();
			Thread.sleep(5000);
			
			MailButtonTest mailTest = new MailButtonTest(driver);
			mailTest.runTest();
			Thread.sleep(5000);

			LoginTest loginTest = new LoginTest(driver);
			loginTest.runTest();
			Thread.sleep(5000);

			UnreadTest unreadTest = new UnreadTest(driver);
			unreadTest.runTest();
			Thread.sleep(5000);

			InboxTest inboxTest = new InboxTest(driver);
			inboxTest.runTest();
			Thread.sleep(5000);

			DraftTest draftTest = new DraftTest(driver);
			draftTest.runTest();
			Thread.sleep(5000);

			SentTest sentTest = new SentTest(driver);
			sentTest.runTest();
			Thread.sleep(5000);

			MoreArchiveTest moreArchiveTest = new MoreArchiveTest(driver);
			moreArchiveTest.runTest();
			Thread.sleep(5000);

			SpamTest spamTest = new SpamTest(driver);
			spamTest.runTest();
			Thread.sleep(5000);

			TrashTest trashTest = new TrashTest(driver);
			trashTest.runTest();
			Thread.sleep(5000);

			LessMoreTest lessMoreTest = new LessMoreTest(driver);
			lessMoreTest.runTest();
			Thread.sleep(5000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.quit();
	}
}