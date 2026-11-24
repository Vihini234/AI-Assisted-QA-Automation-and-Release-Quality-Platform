
package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import specifications.RequestSpec;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class ApiHealthTest {

    @Test
    public void verifyApiStatus() {

        RestAssured
                .given()
                .spec(RequestSpec.getRequestSpec())
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", notNullValue())
                .body("body", notNullValue());
    }
}
