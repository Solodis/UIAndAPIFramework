package business.apibusinessobjects;

import utils.ResponseParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VideoInfo extends BaseBusinessObject {

   private int videoCount = 20;
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
      for (String title: getTitles()){
         System.out.println(title);
      }
   }

   public int getVideoCount() {
      return videoCount;
   }

   public void setVideoCount(int videoCount) {
      this.videoCount = videoCount;
   }

   public String getKind() {
      return kind;
   }

   public void setKind(String kind) {
      this.kind = kind;
   }

   public String getEtag() {
      return etag;
   }

   public void setEtag(String etag) {
      this.etag = etag;
   }

   public String getNextPageToken() {
      return nextPageToken;
   }

   public void setNextPageToken(String nextPageToken) {
      this.nextPageToken = nextPageToken;
   }

   public String getRegionCode() {
      return RegionCode;
   }

   public void setRegionCode(String regionCode) {
      RegionCode = regionCode;
   }

   public List<String> getTitles() {
      return titles;
   }

   public void setTitles(List<String> titles) {
      this.titles = titles;
   }
}
