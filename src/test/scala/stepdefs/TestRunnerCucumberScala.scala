package stepdefs

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
  * Created by Mohammed Suboor on 05-11-2016.
  */
@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("stepdefs"),
  format = Array("pretty", "html:target/cucumber-report")
)
class TestRunnerCucumberScala {

}
