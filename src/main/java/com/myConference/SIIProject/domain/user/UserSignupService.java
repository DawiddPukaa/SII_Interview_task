package com.myConference.SIIProject.domain.user;

import com.myConference.SIIProject.domain.user.account.UserAccount;
import com.myConference.SIIProject.domain.user.account.UserDevice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class UserSignupService {
    private final UserCreator userCreator;
    private final DeviceAuthenticationService deviceAuthenticationService;




    @Transactional
    public SignupResult signupNewUser(CreateUserCommand createUserCommand) {
        UserAccount userAccount = userCreator.create(createUserCommand);
        UserDevice userDevice = deviceAuthenticationService.authenticateFirstTime(userAccount);

        return new SignupResult(userDevice.getToken());
    }
}
