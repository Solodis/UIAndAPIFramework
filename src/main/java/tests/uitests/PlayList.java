package tests.uitests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.MainPage;
import tests.BaseTest;


public class PlayList extends BaseTest {

   private String ITEM = "Music";

   @Test()
   public void checkPlayList(){
      MainPage mainPage = new MainPage(driver);
      new Assertion().assertTrue(mainPage.checkPlayList(ITEM));
   }
}
