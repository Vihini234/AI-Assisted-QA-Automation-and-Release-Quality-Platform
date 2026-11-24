
package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import specifications.RequestSpec;

import static org.hamcrest.Matchers.equalTo;

public class ApiPatchTest {

    @Test
    public void verifyPartialUpdate() {

        String requestBody = """
                {
                    "title": "Updated Title Using PATCH"
                }
                """;

        RestAssured
                .given()
                .spec(RequestSpec.getRequestSpec())
                .body(requestBody)
                .when()
                .patch("/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("Updated Title Using PATCH"));
    }
}
