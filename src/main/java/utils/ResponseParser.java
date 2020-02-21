package utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class ResponseParser {

   private static JsonElement root;
   private static JsonElement element;
   private static JsonArray jsonArray;

   public static String getNodeValue(String response, String key) {
      return getNodeValue(response, key, 0);
   }

   public static String getNodeValue(String response, String key, int index) {
      String[] nodes = key.split("\\.");
      root = new JsonParser().parse(response);
      element = root;
      for (String node : nodes) {
         element = getJsonElement(element, node, index);
      }
      return element.toString();
   }

   private static JsonElement getJsonElement(JsonElement jsonElement, String node, int index) {
      if (jsonElement.isJsonArray()) {
         jsonArray = jsonElement.getAsJsonArray();
         if (jsonArray.size() > index) {
            jsonElement = jsonArray.get(index).getAsJsonObject().get(node);
            return jsonElement;
         }

      } else if (jsonElement.isJsonObject()) {
         return jsonElement.getAsJsonObject().get(node);
      } else if (jsonElement.isJsonPrimitive()) {
         return jsonElement.getAsJsonPrimitive();
      }
      return jsonElement;
   }
}
