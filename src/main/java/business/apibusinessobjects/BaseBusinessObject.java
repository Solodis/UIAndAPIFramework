package business.apibusinessobjects;

import apiobjects.Channels;
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
   protected Channels channels;

   public BaseBusinessObject(String response) throws IOException {
      this.response = response;
   }
}
