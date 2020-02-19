package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class Driver{

   private static WebDriver driverInstance = null;

   private Driver(){

   }
   public static WebDriver getDriver(){
      return getDriver(BrowserType.CHROME);
   }

   public static WebDriver getDriver(BrowserType type){
      if(driverInstance == null){
         driverInstance = selectBrowser(type);
         return driverInstance;
      }else {
         return driverInstance;
      }
   }

   private static WebDriver selectBrowser(BrowserType type) {
      switch (type) {
         case IE: {
            return new InternetExplorerDriver();
         }
         case CHROME: {
            System.setProperty("webdriver.chrome.driver", "C:\\development\\Kronos\\Repositories\\UIAndAPIFramework\\chromedriver.exe");
            return new ChromeDriver();
         }
         case FIREFOX: {
            return new FirefoxDriver();
         }
         default:{
            throw new UnreachableBrowserException("Browser name is not valid");
         }
      }
   }
}
