package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.springframework.test.context.ContextConfiguration;

import configuration.TestFrameworkConfiguration;
import pages.AbstractPage;
import pages.LoginPage;


@SuppressWarnings("unused")
@ContextConfiguration(classes=TestFrameworkConfiguration.class)

public class LoginTest {
	
	
	
	@Value("${web.url}")
	private String host;
	
	@Value("${driver.Path}")
	private String driverPath;
	
	@Autowired
	LoginPage loginPage;
	
	
	@Test
	public void goToUrl() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		System.out.println("a");
		WebDriver driver=new ChromeDriver();
		System.out.println("b");
		loginPage.open("www.google.com");
		System.out.println("c");

		
	}
}
