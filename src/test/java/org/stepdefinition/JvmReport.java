package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String json) {
		//mention target folder location
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReports");
		
		//to add details to report
		Configuration c = new Configuration(f,"FB app");
		c.addClassifications("Platform","Windows");
		c.addClassifications("Browser","Chrome");
		c.addClassifications("Browser version", "80.0");
		c.addClassifications("Sprint", "15");
		
		//to add json files path to list variables
		List<String> jsonfile = new ArrayList<String>();
		jsonfile.add(json);
		
		//to generate report
		ReportBuilder r = new ReportBuilder(jsonfile,c);
		r.generateReports();
	}

}
