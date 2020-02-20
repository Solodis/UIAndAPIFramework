package apiobjects;

public class ChannelInfoAPIObject {

   public static final String BASE_URL = "https://www.googleapis.com/youtube/v3";

   public static final String GET_VIDEOS_LIST = BASE_URL  +"/search?key=" + Keys.API.getKey() + "&channelId=" + Channels.KARMIK_KOALA.getChannelID() +"&part=snippet,id&order=date&maxResults=50";
}
