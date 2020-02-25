package tests.apitests;

import apiobjects.ChannelInfoAPIObject;
import apiobjects.Channels;
import business.apibusinessobjects.BaseBusinessObject;
import business.apibusinessobjects.VideoInfo;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class CheckVideo extends BaseAPITest {

   @Test()
   public void checkAllVideo() throws IOException {
      ChannelInfoAPIObject.setChannel(Channels.KARMIK_KOALA);
      Response response = given().when().get(ChannelInfoAPIObject.GET_VIDEOS_LIST).thenReturn();
      BaseBusinessObject baseBusinessObject = new BaseBusinessObject(response.body().prettyPrint());
      VideoInfo videoInfo = new VideoInfo(response.body().prettyPrint());
   }
}
