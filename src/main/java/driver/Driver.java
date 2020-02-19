package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver{

   private static WebDriver driverInstance = null;

   private Driver(){

   }
   public static WebDriver getDriver(){
      System.setProperty("webdriver.chrome.driver", "C:\\development\\Kronos\\Repositories\\UIAndAPIFramework\\chromedriver.exe");
      if(driverInstance == null){
         driverInstance = new ChromeDriver();
         return driverInstance;
      }else {
         return driverInstance;
      }
   }
}
