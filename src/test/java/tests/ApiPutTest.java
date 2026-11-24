
package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import specifications.RequestSpec;

import static org.hamcrest.Matchers.equalTo;

public class ApiPutTest {

    @Test
    public void verifyUpdatePost() {

        String requestBody = """
                {
                    "id": 1,
                    "title": "Updated QA Automation Project",
                    "body": "Testing PUT request using REST Assured",
                    "userId": 1
                }
                """;

        RestAssured
                .given()
                .spec(RequestSpec.getRequestSpec())
                .body(requestBody)
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("Updated QA Automation Project"))
                .body("body", equalTo("Testing PUT request using REST Assured"))
                .body("userId", equalTo(1));
    }
}
