package Utilits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;

	public WebDriver launchbrowser() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		return driver;
	}

	public void openURL(String url) {
		driver.get(url);
	}

	public void send(WebElement ele, String Value) {
		ele.sendKeys(Value);
	}

	public void tap(WebElement element) {
		element.click();
	}

	public void closebrowser() {
		driver.quit();
	}
}
