package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldReturnPostmanEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("London is the capital of GB")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("London is the capital of GB"))
        ;
    }
}
