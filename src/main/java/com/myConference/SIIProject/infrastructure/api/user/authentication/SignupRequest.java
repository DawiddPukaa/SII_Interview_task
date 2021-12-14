package com.myConference.SIIProject.infrastructure.api.user.authentication;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.myConference.SIIProject.domain.user.CreateUserCommand;
import lombok.Value;


@Value
class SignupRequest {
    String username;
    String name;
    String secondName;
    String password;

    @JsonCreator
    public SignupRequest(
            @JsonProperty("name") String name,
            @JsonProperty("secondName") String secondName,
            @JsonProperty("username") String username,
            @JsonProperty("password") String password
    ) {
        this.name = name;
        this.secondName = secondName;
        this.username = username;
        this.password = password;
    }

    public CreateUserCommand toDomainCommand() {
        return new CreateUserCommand(name, secondName,username, password);
    }
}
