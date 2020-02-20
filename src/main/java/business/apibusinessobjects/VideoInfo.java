package business.apibusinessobjects;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.Map;

public class VideoInfo extends BaseBusinessObject{

   private String kind;
   private String etag;
   private String nextPageToken;
   private String RegionCode;
   private Map<String, Object> items;

   public VideoInfo(String response) throws IOException {
      super(response);

   }
}
