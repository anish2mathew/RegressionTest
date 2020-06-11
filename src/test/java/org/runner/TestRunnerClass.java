package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,monochrome=true,tags= {"@Smoke"},
plugin={"pretty",
	"html:src\\test\\resources\\Reports\\HtmlReports",
	"junit:src\\test\\resources\\Reports\\XmlReports\\fbpage.xml",
	"json:src\\test\\resources\\Reports\\Jsonreports\\fblogin.json",
	 "rerun:src\\test\\resources\\FailedScenarios\\failed.txt"})

public class TestRunnerClass {
	
	@AfterClass
	public static void JvmReportGeneration() {
  JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Jsonreports\\fblogin.json");
	}

}
