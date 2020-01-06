package Groupid.Automation_TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot scrshot=(TakesScreenshot) driver;
		File scrfile=scrshot.getScreenshotAs(OutputType.FILE);
		
		String path="E:\\screenshots";
		
		File destfile= new File(path);
		FileUtils.copyFileToDirectory(scrfile, destfile);
		
		driver.close();
		

	}

}
