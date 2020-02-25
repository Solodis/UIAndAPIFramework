package business.apibusinessobjects;

import builders.Builder;
import io.restassured.response.Response;

public interface APIMethods {

   public Response findById(String id);

   public Response update(Builder builder);

   public Response create(Builder builder);

   public Response delete(String id);

}
