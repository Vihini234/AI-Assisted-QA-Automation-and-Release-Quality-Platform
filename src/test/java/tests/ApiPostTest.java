
package tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import specifications.RequestSpec;
import utils.TestDataReader;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class ApiPostTest {

    @Test
    public void verifyCreatePost() {

        String requestBody =
                TestDataReader.readJsonFile("postData.json");

        RestAssured
                .given()
                .spec(RequestSpec.getRequestSpec())
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("title", equalTo("QA Automation Project"))
                .body("body", equalTo("Learning REST Assured API testing"))
                .body("userId", equalTo(1))
                .body("id", notNullValue());
    }
}
