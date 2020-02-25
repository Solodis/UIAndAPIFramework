package apiobjects;

import builders.Builder;
import business.apibusinessobjects.APIMethods;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ChannelInfoAPIObject implements APIMethods {

   private static final String BASE_URL = "https://www.googleapis.com/youtube/v3";
   private static Channels channel = Channels.KARMIK_KOALA;

   public static final String GET_VIDEOS_LIST = BASE_URL + "/search?key=" + Keys.API.getKey() + "&channelId=" + channel.getChannelID() + "&part=snippet,id&order=date&maxResults=50";

   public static void setChannel(Channels channel) {
      ChannelInfoAPIObject.channel = channel;
   }

   @Override
   public Response findById(String id) {
      ChannelInfoAPIObject.setChannel(Channels.KARMIK_KOALA);
      return given().when().get(ChannelInfoAPIObject.GET_VIDEOS_LIST).thenReturn();
   }

   public Response findAll(String id) {
      ChannelInfoAPIObject.setChannel(Channels.KARMIK_KOALA);
      return given().when().get(ChannelInfoAPIObject.GET_VIDEOS_LIST).thenReturn();
   }

   @Override
   public Response update(Builder builder) {
      return null;
   }

   @Override
   public Response create(Builder builder) {
      return null;
   }

   @Override
   public Response delete(String id) {
      return null;
   }
}
