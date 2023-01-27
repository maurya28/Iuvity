package co.com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", glue = {
		"co.com.saucedemo.stepsdefinitions" }, snippets = CucumberOptions.SnippetType.CAMELCASE, plugin = { "pretty",
				"html:target/cucumber", "json:target/cucumber/cucumber.json" })

public class SaucedemoRunner {

}
