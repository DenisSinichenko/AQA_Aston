package org.example.lesson2_8.PostmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PatchRequest {

    @Test
    public void testPatchRawText() {
        String requestBody = "AQA Aston PATCH";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(requestBody)
                .when().patch("/patch")
                .then().log().body()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }
}