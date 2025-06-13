package org.example.lesson2_8.PostmanEcho;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutRequest {

    @Test
    public void testPutRawText() {
        String requestBody = "AQA Aston PUT";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(requestBody)
                .when().put("/put")
                .then().log().body()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }
}