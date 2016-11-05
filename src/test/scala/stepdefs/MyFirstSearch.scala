package stepdefs

import java.util.concurrent.TimeUnit

import cucumber.api.scala.{ScalaDsl, EN}
import org.openqa.selenium.By
import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest.Matchers

/**
  * Created by Mohammed Suboor on 05-11-2016.
  */
class MyFirstSearch extends ScalaDsl with EN with Matchers{

  val driver = new FirefoxDriver()
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)

  Given("""^I have navigated to google$"""){ () =>
    driver.navigate().to("http://www.google.com")
  }

  When("""^I search for "([^"]*)"$"""){ (searchTerm:String) =>
    driver.findElement(By.id("lst-ib")).sendKeys(searchTerm)
    driver.findElement(By.className("lsb")).click();
  }

  Then("""^the page title should be "([^"]*)"$"""){ (title:String) =>
    driver.getTitle.shouldEqual(title)
  }

}
