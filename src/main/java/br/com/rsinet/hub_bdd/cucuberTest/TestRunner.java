package br.com.rsinet.hub_bdd.cucuberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature"
 ,glue={"br.com.rsinet.hub_bdd.stepDefinitionsSearch"}
 ,tags = {"@SearchTest"}
 
 )

public class TestRunner {

}
