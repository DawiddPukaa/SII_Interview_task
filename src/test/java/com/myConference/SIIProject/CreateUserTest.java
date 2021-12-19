package com.myConference.SIIProject;


import com.myConference.SIIProject.domain.user.CreateUserCommand;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import org.springframework.http.MediaType;

public class CreateUserTest extends BaseIntegrationTest {

    @Test
    public void createUser() throws Exception {

        CreateUserCommand createUserCommand = new CreateUserCommand("Dawid", "Puka",
                "Dawidos", "Lolek123");

        ValidatableResponse response = RestAssured.given()
                .body(createUserCommand)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .post(localhost().path("/authentication/signup").toUriString())
                .then();

        response.statusCode(200);
    }
}
