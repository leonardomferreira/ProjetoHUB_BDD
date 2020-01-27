package br.com.rsinet.hub_bdd.stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import br.com.rsinet.hub_bdd.cucuberTest.TestRunner;
import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.util.Wait;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	TestContext testContext;
	WebDriverManager manager;
	WebDriver driver;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getWebDriverManager();
		driver = manager.getDriver();
	}

	@Before
	public void BeforeSteps() {
		manager.getDriver();
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) throws IOException {
		Wait.untilPageLoadComplete(driver);
		String screenshotName = scenario.getName().replaceAll(" ", "_");

		File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
				.getScreenshotAs(OutputType.FILE);

		File destinationPath = new File(TestRunner.caminhoPasta + "/" + screenshotName + ".png");

		Files.copy(sourcePath, destinationPath);

		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}

}