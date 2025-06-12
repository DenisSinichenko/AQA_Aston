package org.example.lesson2_8.PostmanEcho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequestFormData {

    @Test
    public void testPostFormData() {
        String requestBody = "{ \"foo1\": \"bar1\", \"foo2\": \"bar2\" }";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body(requestBody)
                .when().post("/post")
                .then().log().body()
                .assertThat()
                .statusCode(200)
                .body("data.foo1", equalTo("bar1"))
                .body("data.foo2", equalTo("bar2"));
    }
}