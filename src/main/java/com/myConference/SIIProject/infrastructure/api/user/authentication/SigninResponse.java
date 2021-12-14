package com.myConference.SIIProject.infrastructure.api.user.authentication;

import com.myConference.SIIProject.domain.user.account.UserDevice;
import lombok.Value;


@Value
public class SigninResponse {
    String token;

    public static SigninResponse fromDomain(UserDevice userDevice) {
        return new SigninResponse(userDevice.getToken());
    }
}
