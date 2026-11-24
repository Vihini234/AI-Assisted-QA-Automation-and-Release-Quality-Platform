
package specifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpec {

    public static ResponseSpecification getResponseSpec(
            int expectedStatusCode) {

        return new ResponseSpecBuilder()
                .expectStatusCode(expectedStatusCode)
                .build();
    }
}
