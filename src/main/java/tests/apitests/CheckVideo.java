package tests.apitests;

import apiobjects.ChannelInfoAPIObject;
import business.apibusinessobjects.BaseBusinessObject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CheckVideo extends BaseAPITest {

   @Test()
   public void checkAllVideo() throws IOException {
      Response response = given().when().get(ChannelInfoAPIObject.GET_VIDEOS_LIST).thenReturn();
      BaseBusinessObject baseBusinessObject = new BaseBusinessObject(response.body().prettyPrint());
      for (String videoName : baseBusinessObject.getNodeValue("items.snippet.title")){
         System.out.println("****" + videoName + "******");

      }
   }
}
