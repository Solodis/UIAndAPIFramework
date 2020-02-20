package utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

public class ResponseParser {

   private static JsonElement root;
   private static JsonObject jsonObject;
   private static JsonArray jsonArray;

   public static String getNodeValue(String response, String key) {
      return getNodeValue(response, key, 0);
   }

   public static String getNodeValue(String response, String key, int index) {
      String[] nodes = key.split("\\.");
      String result = null;
      root = new JsonParser().parse(response);
      jsonObject = root.getAsJsonObject();

      for (String node : nodes) {
         if (jsonObject.get(node).isJsonObject()) {
            jsonObject = jsonObject.get(node).getAsJsonObject();
            result = jsonObject.toString();
         } else if (jsonObject.get(node).isJsonPrimitive()) {
            result = jsonObject.get(node).getAsString();
         } else if (jsonObject.get(node).isJsonArray()) {
            if (jsonObject.get(node).getAsJsonArray().size() > index) {
               jsonObject = jsonObject.get(node).getAsJsonArray().get(index).getAsJsonObject();
            } else {
               result = jsonObject.toString();
               break;
            }
            result = jsonObject.toString();
         }
      }
      return result;
   }

   public static String getNodeValue(String response, String key, int index) {
      root = new JsonParser().parse(response);
      JsonElement element;
      String[] nodes = key.split("\\.");
      if (root.isJsonArray()) {
         element = root.getAsJsonArray();
         for (String node : nodes) {
            element = parseJsonArray(element, node);
         }

      } else if (root.isJsonObject()) {
         element = root.getAsJsonObject();
         for (String node : nodes) {
            element = parseJsonObject(element, key);
         }
      }
      for (String node : nodes) {

      }
   }

   private static JsonElement parseJsonArray(JsonArray array, String key) {
      for (int i = 0; i < array.size(); i++) {
         if (array.get(i).isJsonObject()) {
            return parseJsonObject(array.get(i).getAsJsonObject(), key);
         } else if (array.get(i).isJsonPrimitive()) {
            return array.get(i).getAsJsonPrimitive();
         }
      }
      return null;
   }

   private static JsonElement parseJsonObject(JsonObject object, String key) {
      if (object.get(key).isJsonArray()) {
         object.get(key);
      } else if (object.get(key).isJsonObject()) {
         parseJsonObject(object.get(key).getAsJsonObject(), key);
      }
      object.get(key);
   }
}
