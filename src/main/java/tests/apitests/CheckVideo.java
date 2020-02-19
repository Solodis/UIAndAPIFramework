package tests.apitests;

import apiobjects.ChannelInfoAPIObject;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CheckVideo extends BaseAPITest{

   @Test()
   public void checkAllVideo(){
      Response response = given().param("page.page", "1").param("page.size", "1").param("page.sort", "start_time,ASC")
      .when().get(ChannelInfoAPIObject.URL).thenReturn();
      response.body();
   }
}
