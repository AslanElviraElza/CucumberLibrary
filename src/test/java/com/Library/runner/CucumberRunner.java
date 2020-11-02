package com.Library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue="com/Library/step_definitions",
dryRun=false,
tags="@Login or @editBook"

)
public class CucumberRunner {

}
