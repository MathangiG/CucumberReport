package org.base;

import java.io.File;
import java.util.*;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	public static void JVMReportGeneration(String json) {
		File file = new File("C:\\Users\\Sankar Muthumani\\eclipse-workspace\\AdactineHotelCucumber\\CucumberReport");
		Configuration conf = new Configuration(file,"Facebook");
		conf.addClassifications("Platform", "Win - 10");
		conf.addClassifications("Browser", "Chrome");
		conf.addClassifications("Sprint No", "32");
		List<String> li = new ArrayList<String>();
		li.add(json);
		ReportBuilder builder = new ReportBuilder(li, conf);
		builder.generateReports();
	
	}
}
