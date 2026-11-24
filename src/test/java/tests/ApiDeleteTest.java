
package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import specifications.RequestSpec;

public class ApiDeleteTest {

    @Test
    public void verifyDeletePost() {

        RestAssured
                .given()
                .spec(RequestSpec.getRequestSpec())
                .when()
                .delete("/posts/1")
                .then()
                .statusCode(200);
    }
}
