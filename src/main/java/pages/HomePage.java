package pages;

import org.openqa.selenium.By;

public class HomePage extends AbstractPage {
	
	@Override
	public boolean isCurrentPage() {
		return getDriver().getTitle().equalsIgnoreCase("Homepage");
	}
	
	public void clickOnSearchFilter() {
		fluentWait(By.id("__w2_w6wC6w8s12_input")).isDisplayed();
		getDriver().findElement(By.id("__w2_w6wC6w8s12_input")).click();
	}
	
	
	

}
