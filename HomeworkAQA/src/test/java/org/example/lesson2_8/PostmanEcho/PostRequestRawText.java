package org.example.lesson2_8.PostmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequestRawText {

    @Test
    public void testPostRawText() {
        String requestBody = "{ \"test\": \"AQA Aston\" }";

        given()
                .log()
                .body()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body(requestBody)
                .when().post("/post")
                .then().log().body()
                .assertThat()
                .body("data.test", equalTo("AQA Aston"));
    }
}