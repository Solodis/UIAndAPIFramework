package business.apibusinessobjects;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseBusinessObject {

   private ObjectMapper mapper = new ObjectMapper();
   private Map<String, Object> responseMap;
   protected String response;
   protected List<String> results = new ArrayList<String>();

   public BaseBusinessObject(String response) throws IOException {
      this.response = response;
      responseMap = parseResponse(response);
   }

   private Map<String, Object> parseResponse(String response) throws IOException {
      return mapper.readValue(response, Map.class);
   }

   public List<String> getNodeValue(String key) throws IOException {
      String[] nods = key.split("\\.");
      String result = response;
      for (String node : nods) {
         result = parseResponse(result).get(node).toString().replaceAll("\\[", "").replaceAll("]", "");
         results.add(result);
      }
      return results;
   }
}
