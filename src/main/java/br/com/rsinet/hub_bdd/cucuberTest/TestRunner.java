package br.com.rsinet.hub_bdd.cucuberTest;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.managers.FileReaderManager;
import br.com.rsinet.hub_bdd.util.DataPrint;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", 
	glue = { "br.com.rsinet.hub_bdd.stepDefinitions" }, 
	tags = { "@SearchTest"}, 
	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
	monochrome = true
)

public class TestRunner {
	
	public static String caminhoPasta = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/"
			+ DataPrint.horas();

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
	@BeforeClass
	public static void criarPastaPrint() {
		File pastaScreenFile = new File(caminhoPasta);
		pastaScreenFile.mkdir();
	}
	
}