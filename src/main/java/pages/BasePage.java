package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

   protected WebDriver driver;

   public BasePage(WebDriver driver){
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

}
