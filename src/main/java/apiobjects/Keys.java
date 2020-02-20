package apiobjects;

public enum Keys {

   API("AIzaSyCfmM2L56HaR4Bj2QieTSWdk0T-wjbew5o");

   private String key;
   Keys(String key) {
      this.key = key;
   }

   public String getKey(){
      return key;
   }
}
