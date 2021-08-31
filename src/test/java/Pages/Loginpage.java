package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilits.Base;

public class Loginpage extends Base {

	WebDriver driver;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
