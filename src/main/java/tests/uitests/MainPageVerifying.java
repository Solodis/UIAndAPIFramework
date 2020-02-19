package tests.uitests;

import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Description;
import tests.BaseTest;

public class MainPageVerifying extends BaseTest {

   @Test(alwaysRun = true)
   @Description("Just check yhat youtube button is displayed")
   public void verifyMainPagePositiveTest(){
      MainPage mainPage = new MainPage(driver);
      new Assertion().assertTrue(mainPage.youTubeBtn.isDisplayed());
      mainPage.clickYouTubeButton();

   }
}
