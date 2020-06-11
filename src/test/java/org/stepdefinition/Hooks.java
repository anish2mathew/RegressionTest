package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	static WebDriver driver;
	
	@Before(order=1)
	public void beforeScenario1() {
		System.out.println("before scenario 1");
	}
	@After(order=1)
	public void afterScenario1() {
		System.out.println("after scnario 1");
	}
	@Before(order=2)
	public void beforeScenario2() {
		System.out.println("before scenario 2");
	}
	@After(order=2)
	public void afterScenario2() {
		System.out.println("after scnario 2");
	}
	@Before(order=3)
	public void beforeScenario3() {
		System.out.println("before scenario 3");
	}
	@After(order=3)
	public void afterScenario3(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			
		}
		
	}

}
