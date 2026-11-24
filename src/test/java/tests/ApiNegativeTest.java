
package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import specifications.RequestSpec;

public class ApiNegativeTest {

    @Test
    public void verifyInvalidPostReturns404() {

        RestAssured
                .given()
                .spec(RequestSpec.getRequestSpec())
                .when()
                .get("/posts/9999")
                .then()
                .statusCode(404);
    }
}
