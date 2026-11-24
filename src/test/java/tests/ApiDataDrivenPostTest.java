
package tests;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import specifications.RequestSpec;
import specifications.ResponseSpec;
import utils.TestDataReader;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class ApiDataDrivenPostTest {

    @DataProvider(name = "postData")
    public Object[][] postDataProvider() {

        String jsonData =
                TestDataReader.readJsonFile("multiplePostData.json");

        List<Map<String, Object>> posts =
                JsonPath.from(jsonData).getList("");

        Object[][] testData = new Object[posts.size()][1];

        for (int i = 0; i < posts.size(); i++) {
            testData[i][0] = posts.get(i);
        }

        return testData;
    }

    @Test(dataProvider = "postData")
    public void verifyCreatePostWithMultipleData(
            Map<String, Object> postData) {

        given()
                .spec(RequestSpec.getRequestSpec())
                .body(postData)
                .when()
                .post("/posts")
                .then()
                .spec(ResponseSpec.getResponseSpec(201))
                .body("title", equalTo(postData.get("title")))
                .body("body", equalTo(postData.get("body")))
                .body("userId", equalTo(postData.get("userId")))
                .body("id", notNullValue());
    }
}
