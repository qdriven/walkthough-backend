package io.qmeta.saucelab.parallel.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty"})
public class RunTestsAT extends AbstractTestNGCucumberTests{
}
