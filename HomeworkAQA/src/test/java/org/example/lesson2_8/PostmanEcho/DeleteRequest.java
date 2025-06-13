package org.example.lesson2_8.PostmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteRequest {

    @Test
    public void testDelete() {
        String requestBody = "AQA Aston Delete";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(requestBody)
                .when().delete("/delete")
                .then().log().body()
                .assertThat()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }
}