package main;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Loginpage;
import Utilits.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLogin extends Base {

	WebDriver driver;
	Loginpage lp;

	@Before
	public void before() {
		driver = launchbrowser();
		lp = new Loginpage(driver);
	}

	@Given("launch the browser and open Facebook URL")
	public void launch_the_browser_and_open_facebook_url() {
		openURL("https://www.facebook.com/");
	}

	@When("enter the username and password")
	public void enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> asMaps = dataTable.asMaps();

		send(lp.getUsername(), asMaps.get(0).get("username"));

		send(lp.getPassword(), asMaps.get(0).get("password"));

	}

	@When("enter the {string} and {string}")
	public void enter_the_and(String username, String password) {

		send(lp.getUsername(), username);
		send(lp.getPassword(), password);
	}

	@Then("validate the login message")
	public void validate_the_login_message() {

		tap(lp.getLogin());
	}

	@After
	public void after() {
		closebrowser();
	}
}
