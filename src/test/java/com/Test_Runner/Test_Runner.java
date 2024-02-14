package com.Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Hari\\eclipse-workspace\\com.project1\\src\\test\\java\\feature_files",
                  glue="com.Stepdefinition_Class",plugin= {"pretty","json:target/amazon.json","html:target/amazon.json"})

public class Test_Runner {

	
	
}
