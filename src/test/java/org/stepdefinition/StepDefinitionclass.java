package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionclass {
	static WebDriver driver;


@Given("enter the fb website")
public void enter_the_fb_website() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\anishpc\\eclipse-workspace\\Cucumbermap2d\\chromecdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
  

@When("enter {string} and {string}")
public void enter_and(String s1, String s2) {
   driver.findElement(By.id("emailid")).sendKeys(s1);
   driver.findElement(By.id("pass")).sendKeys(s2);
}

@When("click login")
public void click_login() {
	WebElement login = driver.findElement(By.id("loginbutton"));
    login.click();
}

@Then("print login or not")
public void print_login_or_not() {
    
}

@Given("enter the fb page")
public void enter_the_fb_page() {
	System.setProperty("webdriver.chrome.driver","C:\\User\\anishpc\\eclipse-workspace\\Cucumbermap2d\\chromecdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
   
}

@When("enter {string},{string},{string}")
public void enter(String s1, String s2, String s3) {
	driver.findElement(By.name("reg_passwd__")).sendKeys(s3);
	driver.findElement(By.name("firstname")).sendKeys(s1);
	driver.findElement(By.name("lastname")).sendKeys(s2);
   
}

@When("click signup")
public void click_signup() {
   WebElement click = driver.findElement(By.name("websubmit"));
   click.click();
}

@Then("print sigining up or not")
public void print_sigining_up_or_not() {
    
}



}
