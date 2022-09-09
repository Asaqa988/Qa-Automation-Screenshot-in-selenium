import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot_project {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");

		Date timestamp = new Date();
		String newtimestamp = timestamp.toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();

		for (int i = 0; i < 10; i++) {
			driver.get("https://www.yahoo.com");

			TakesScreenshot ts = (TakesScreenshot) driver;

			Thread.sleep(3000);
			File file = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./ScreenShot_Folder/" + newtimestamp + ".jpg"));

		}
	}
	}


