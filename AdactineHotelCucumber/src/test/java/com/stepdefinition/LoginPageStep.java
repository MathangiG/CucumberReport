package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPageStep {
	
	WebDriver driver;
	
	@Given("User is on Adactine Login page")
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
	}
	@When("User should login {string} and {string}")
	public void user_should_login_and(String userName, String pwd) {
	    
		driver.findElement(By.id("username")).sendKeys(userName);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    driver.findElement(By.id("login")).click();
	}

	@When("User should search hotel {string} , {string} , {string} , {string} , {string} and {string}")
	public void user_should_search_hotel_and(String location, String name, String type, String number, String adult, String child) {

		Select s1 = new Select(driver.findElement(By.id("location")));
		s1.selectByVisibleText(location);

		Select s2 = new Select(driver.findElement(By.id("hotels")));
		s2.selectByVisibleText(name);

		Select s3 = new Select(driver.findElement(By.id("room_type")));
		s3.selectByVisibleText(type);

		Select s4 = new Select(driver.findElement(By.id("room_nos")));
		s4.selectByVisibleText(number);

		Select s5 = new Select(driver.findElement(By.id("adult_room")));		
		s5.selectByVisibleText(adult);

		Select s6 = new Select(driver.findElement(By.id("child_room")));
		s6.selectByVisibleText(child);

		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();		
	}

	@When("User should select the room")
	public void user_should_select_the_room() {
	    
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();

		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	}

	@When("User should book room {string} , {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void user_should_book_room_and(String firstName, String lastName, String address, String ccNum, String ccType, String ccExpMonth, String ccExpYear, String ccCvv) {

		driver.findElement(By.id("first_name")).sendKeys(firstName);

		driver.findElement(By.id("last_name")).sendKeys(lastName);

		driver.findElement(By.id("address")).sendKeys(address);

		driver.findElement(By.id("cc_num")).sendKeys(ccNum);

		Select s7 = new Select(driver.findElement(By.id("cc_type")));
		s7.selectByVisibleText(ccType);

		Select s8 = new Select(driver.findElement(By.id("cc_exp_month")));
		s8.selectByVisibleText(ccExpMonth);

		Select s9 = new Select(driver.findElement(By.id("cc_exp_year")));
		s9.selectByVisibleText(ccExpYear);

		driver.findElement(By.id("cc_cvv")).sendKeys(ccCvv);

		driver.findElement(By.id("book_now")).click();
	}

	@Then("User should generate order Id")
	public void user_should_generate_order_Id() {
	    
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement order = driver.findElement(By.id("order_no"));
		System.out.println("Booking Order Number : "+order.getText());
		driver.close();
	}
	
	@Then("User should Validate the page")
	public void user_should_Validate_the_page() {
	    driver.close();
	}
	

	

}
