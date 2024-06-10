package YamunaPractice.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\YamunaPractice\\Resources\\GlobalData.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeMethod
	public void launchApplication() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public String getScreenshot(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\reports\\"+testcasename+".png");
		FileUtils.copyFile(src, dest);
		return System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";	
	}
}
