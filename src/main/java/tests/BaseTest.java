package tests;

import driver.BrowserType;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import ru.yandex.qatools.allure.testng.AllureTestListener;

import java.util.concurrent.TimeUnit;

public class BaseTest extends AllureTestListener {

   protected WebDriver driver;

   @Parameters({"URL"})
   @BeforeSuite
   protected void testInit(String URL){
      driver = Driver.getDriver(BrowserType.CHROME);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.navigate().to(URL);
   }

   @AfterSuite()
   protected void closeBrowser(){
      driver.quit();
   }
}
