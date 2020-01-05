package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
public class LoginPage extends AbstractPage{
	
	@Override
	public boolean isCurrentPage() {
		
		String url=getDriver().getCurrentUrl();
		if(url.equalsIgnoreCase("https://www.quora.com/"));
		return true;
	}
	
	public void setUsername(String username) {
		getDriver().findElement(By.id("__w2_wiIU5mhI21_email")).clear();
		getDriver().findElement(By.id("__w2_wiIU5mhI21_email")).sendKeys(username);
	}
	
	public void setPassword(String password) {
		getDriver().findElement(By.id("__w2_wiIU5mhI21_password")).clear();
		getDriver().findElement(By.id("__w2_wiIU5mhI21_password")).sendKeys(password);
	}
	
	public void submit() {
		getDriver().findElement(By.id("__w2_wiIU5mhI21_submit_button")).submit();
	}
	
	@SuppressWarnings("deprecation")
	public void isUserLoggedIn() {
		WebDriverWait webDriverWait=new WebDriverWait(getDriver(),50);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("__w2_wDTbpDuX11_name_link")));
	
	}
	
	public void open(String host) {
		
		getDriver().navigate().to(host);
		
	}

}
