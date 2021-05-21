package org.samplerun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\Amritha_Cucumber\\src\\test\\resources\\Featurefiles\\Login.feature",glue="org.stepdefinition",dryRun=true,monochrome=true)
public class RunAll {

}
