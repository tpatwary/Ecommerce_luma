package luma.us.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;

	public BasePage()  {
		// How to configure properties file?
		log = Logger.getLogger("QA Test Lead -Tanu ");
		PropertyConfigurator.configure("log4j.properties");
		
		prop = new Properties();
		FileInputStream fl;
		try {
			fl = new FileInputStream("./src/main/java/com/us/config/Config.properties");// confing file path
			prop.load(fl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("config file is found");
		}
	}
	// How I can initialize all the browser in base class?

	public static void Broswer_initializations() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			log.info("Start Automation in Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			log.info("Start Automation in Edge Browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			log.info("Start Automation in Firefox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		// driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.get(prop.getProperty("URL"));

	}
}
