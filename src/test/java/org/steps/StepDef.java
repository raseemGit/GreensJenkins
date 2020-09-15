package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	static WebDriver driver;

	@Given("B")
	public void b() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("D")
	public void d() {
		driver.findElement(By.id("email")).sendKeys("Farith");
		driver.findElement(By.id("pass")).sendKeys("Raseem");

	}

	@Then("E")
	public void e() {
		System.out.println("Login Failed");
		
		
	}

}
