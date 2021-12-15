package com.myConference.SIIProject.infrastructure.userdevice;

import com.myConference.SIIProject.domain.user.account.UserAccount;
import com.myConference.SIIProject.domain.user.account.UserDevice;
import com.myConference.SIIProject.domain.user.account.UserDeviceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class DelegatingUserDeviceRepository implements UserDeviceRepository {
    private final JpaBasedUserDeviceRepository userDeviceRepository;

    @Override
    public Optional<UserDevice> findByUserAccount(UserAccount userAccount) {
        return userDeviceRepository.findByUserAccount(userAccount);
    }

    @Override
    public Optional<UserDevice> findByToken(String token) {
        return userDeviceRepository.findByToken(token);
    }

    @Override
    public UserDevice save(UserDevice userDevice) {
        return userDeviceRepository.save(userDevice);
    }
}
