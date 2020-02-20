package business.apibusinessobjects;

import utils.ResponseParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideoInfo extends BaseBusinessObject {

   private int videoCount = 50;
   private String kind;
   private String etag;
   private String nextPageToken;
   private String RegionCode;
   private List<String> titles = new ArrayList<String>();

   public VideoInfo(String response) throws IOException {
      super(response);
      for (int i = 0; i < videoCount; i++) {
         titles.add(ResponseParser.getNodeValue(response, "items.snippet.title", i));
      }
      kind = ResponseParser.getNodeValue(response, "kind");
   }

   public void setVideosCount(int count){
      if(count > 0){
         videoCount = count;
      } else if(count <= 0){
         System.out.println("Count is invalid: " + count);
      }
   }
}
