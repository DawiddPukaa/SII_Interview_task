package com.myConference.SIIProject.infrastructure.api.user.authentication;

import com.myConference.SIIProject.domain.user.CreateUserCommand;
import com.myConference.SIIProject.domain.user.DeviceAuthenticationService;
import com.myConference.SIIProject.domain.user.SignupResult;
import com.myConference.SIIProject.domain.user.UserSignupService;
import com.myConference.SIIProject.domain.user.account.UserDevice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/authentication")
@AllArgsConstructor
public class UserAuthenticationEndpoint {
    private final UserSignupService userSignupService;
    private final DeviceAuthenticationService deviceAuthenticationService;

    @PostMapping(path = "/signup", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public SignupResponse signup(@RequestBody SignupRequest signupRequest) {
        CreateUserCommand command = signupRequest.toDomainCommand();

        SignupResult signupResult = userSignupService.signupNewUser(command);

        return SignupResponse.fromDomain(signupResult);
    }

    @PostMapping(path = "/signin", consumes = APPLICATION_FORM_URLENCODED_VALUE, produces = APPLICATION_JSON_VALUE)
    public SigninResponse signin(Principal principal) {
        UserDevice userDevice = deviceAuthenticationService.authenticateNewDeviceFor(principal.getName());

        return SigninResponse.fromDomain(userDevice);
    }
}

