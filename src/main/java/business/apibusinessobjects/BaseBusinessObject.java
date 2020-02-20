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
   }
}
