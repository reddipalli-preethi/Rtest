package code_ass2;


	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@SuppressWarnings("deprecation")
	@RunWith(Cucumber.class)
	@CucumberOptions ( 
			
		features = "src/test/resources/feature/times.feature",
		glue = {"code_ass2"},
		monochrome = true,
		plugin = {"pretty", "html:target/HtmlReports.html", "json:target/JSONReports.xml"}
			)

	public class testrunner extends AbstractTestNGCucumberTests {

	}

