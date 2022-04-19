package Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseModel.BaseClass;

public class Day1 extends BaseClass{
	WebElement SignIn;
	
	@Test
	public void Opening() {
		driver.get(Google);
		driver.get(AppUrl);
		driver.findElement(By.className("login")).click();;
	    SignIn = driver.findElement(By.className("login"));
	    SignIn.click();
	}
public void clickOnSignIn() {
	
}
}
