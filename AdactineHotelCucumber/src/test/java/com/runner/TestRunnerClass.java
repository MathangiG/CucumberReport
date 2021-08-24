package com.runner;

import org.base.ReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", tags = { "@tag2,@tag3" }, dryRun = false, glue = {
		"com.stepdefinition" }, plugin = { "pretty",
				"json:C:\\Users\\Sankar Muthumani\\eclipse-workspace\\AdactineHotelCucumber\\Report Generation\\fb.json",
				"json:C:\\Users\\Sankar Muthumani\\eclipse-workspace\\AdactineHotelCucumber\\CucumberReport\\fb.json" })
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
		ReportingClass.JVMReportGeneration(
				"C:\\Users\\Sankar Muthumani\\eclipse-workspace\\AdactineHotelCucumber\\CucumberReport\\fb.json");
	}
}
