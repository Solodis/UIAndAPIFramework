package tests;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import ru.yandex.qatools.allure.testng.AllureTestListener;

public class BaseTest extends AllureTestListener {

   protected WebDriver driver;

   @Parameters({"URL"})
   @BeforeSuite
   protected void testInit(String URL){
      driver = Driver.getDriver();
      driver.manage().window().maximize();
      driver.navigate().to(URL);
   }

   @AfterSuite()
   protected void closeBrowser(){
      driver.quit();
   }
}
