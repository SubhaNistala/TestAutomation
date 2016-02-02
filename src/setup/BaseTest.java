package setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver = null;
	
	public void setup(){
		Properties PF = new Properties();
		
		try {
			FileInputStream FS = new FileInputStream("config.properties");
			PF.load(FS);
			
			if(PF.getProperty("browser").contains("Firefox")){
				driver = new FirefoxDriver();
			}
			if(PF.getProperty("browser").contains("Chrome")){
				driver = new ChromeDriver();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get(PF.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}