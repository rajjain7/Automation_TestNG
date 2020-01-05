package Groupid.Automation_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext()) {
			
			String childWindow=(String) i1.next();
			
			if(!mainWindow.equalsIgnoreCase(childWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(childWindow);	                                                                                                           
                    driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");                			
                    
                    driver.findElement(By.name("btnLogin")).click();			
                                 
			// Closing the Child Window.
                        driver.close();		
            }	
			
			// Switching to Parent window i.e Main Window.
            driver.switchTo().window(mainWindow);
		}
		// to handle multiple windows
		//ArrayList<String> newtab=new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(newtab.get(1));
		

	}

}
