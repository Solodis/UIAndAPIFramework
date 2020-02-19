package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

   @FindBy(xpath = "//ytd-topbar-logo-renderer[@id='logo']//div[@id='logo-icon-container']")
   public WebElement youTubeBtn;

   @FindBy(id = "//button[@aria-label='Гид']//yt-icon[@id = 'guide-icon']")
   public WebElement guideIcone;

   public MainPage(WebDriver driver) {
      super(driver);
      this.driver = driver;
   }

   public void clickYouTubeButton(){
      youTubeBtn.click();
   }

   public boolean checkPlayList(String playList){
      return driver.findElement(By.xpath(String.format("//yt-formatted-string[text()='Music']", playList))).isDisplayed();
   }
}
