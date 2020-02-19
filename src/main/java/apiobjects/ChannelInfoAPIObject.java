package apiobjects;

public class ChannelInfoAPIObject {


   private static final String API_KEY = "AIzaSyCfmM2L56HaR4Bj2QieTSWdk0T-wjbew5o";
   private static final String CHANNAL_ID = "UCIvkS0o7Csl6EuA7gCmdgqg";
   public static String URL = "https://www.googleapis.com/youtube/v3/search?key=" + API_KEY + "&channelId=" + CHANNAL_ID +"&part=snippet,id&order=date&maxResults=50";
}
