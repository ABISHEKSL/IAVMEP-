package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions( plugin={"pretty", "html:test-output", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

features= {"C:\\IAVMEP\\src\\test\\resources\\Feature\\IAVMEP.feature"},
glue= {"Stepclass"}, strict = true,
monochrome= true

)
public class runallclass {





}


//TeatdataReading
