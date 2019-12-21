package pages;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.openqa.selenium.JavascriptExecutor;



@SuppressWarnings("unused")
public abstract class AbstractPage {
	
	
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public abstract boolean isCurrentPage();
	
	protected WebElement fluentWait(final By locator) {
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(getDriver()).
				withTimeout(null).
				pollingEvery(null).ignoring(NoSuchElementException.class);
		
		return (WebElement) wait;
		
	}
	
	public void refreshThePage() {
		getDriver().navigate().refresh();
	}

	public void switchToNewWindow() {
		
         @SuppressWarnings("unused")
		String mainWindow=getDriver().getWindowHandle();
		
		Set<String> s1=getDriver().getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext()) {
			
			@SuppressWarnings("unused")
			String childWindow=(String) i1.next();
			
		}
	}
	
	public void switchToParentWindow() {
		
		String mainWindow=getDriver().getWindowHandle();
		driver.switchTo().window(mainWindow);
	}
	
	public void clickOn(By by) throws InterruptedException {
		
		@SuppressWarnings("deprecation")
		WebDriverWait webDriverWait =new WebDriverWait(getDriver(), 40);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
		fluentWait(by);
		
		JavascriptExecutor js=(JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", getDriver().findElement(by));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",getDriver().findElement(by));
		Thread.sleep(3000);
		
	}
	
	public void jsClick(WebElement we) {
		JavascriptExecutor js=(JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();",we);
	}
	
	public boolean isElementSelected(By by) {
		@SuppressWarnings("deprecation")
		WebDriverWait webDriverWait=new WebDriverWait(getDriver(),50);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
		return getDriver().findElement(by).isSelected();
		}
	
	public boolean isElementDisplayed(By by) {
		@SuppressWarnings("deprecation")
		WebDriverWait webDriverWait=new WebDriverWait(getDriver(),50);
		webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		return true;
	
	}
	
	public boolean isElementVisible(By by) {
		@SuppressWarnings("deprecation")
		WebDriverWait webDriverWait=new WebDriverWait(getDriver(),50);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return getDriver().findElement(by).isDisplayed();
	
	}
	
	public void sendKeys(By by, String input) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(input);
	}
	
	@SuppressWarnings("deprecation")
	public void click(By by) {
		Actions actions=new Actions(getDriver());
		WebDriverWait webDriverWait=new WebDriverWait(getDriver(),50);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
		actions.moveToElement(getDriver().findElement(by)).click().build().perform();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
