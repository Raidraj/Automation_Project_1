package Java_coding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_coding_class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver;
driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
Thread.sleep(2000);

	}
}
