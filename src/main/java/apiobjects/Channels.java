package apiobjects;

public enum  Channels {

   KARMIK_KOALA("UCIvkS0o7Csl6EuA7gCmdgqg"),
   IKARUS("UCEHXrV8ikvkLTMkYdbiu3mA");

   private final String channelId;

   Channels(String id) {
      this.channelId = id;
   }

   public String getChannelID(){
      return channelId;
   }

}
