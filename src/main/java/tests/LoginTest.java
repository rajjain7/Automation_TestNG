package tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.springframework.test.context.ContextConfiguration;

import configuration.TestFrameworkConfiguration;
import pages.AbstractPage;


@SuppressWarnings("unused")
@ContextConfiguration(classes=TestFrameworkConfiguration.class)
public class LoginTest {
	
	@Value("${url}")
	private String host;
	
	@Value("${driverPath}")
	private String driverPath;
	
	@Autowired
	AbstractPage abstractPage;
	
	
	@Test
	public void goToUrl() {
		System.setProperty("webdriver.chrome.driver",driverPath);
		abstractPage.getDriver().get(host);
		
		
	}
}
