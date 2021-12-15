package com.myConference.SIIProject.infrastructure.userdevice;

import com.myConference.SIIProject.domain.user.account.UserAccount;
import com.myConference.SIIProject.domain.user.account.UserDevice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JpaBasedUserDeviceRepository extends JpaRepository<UserDevice, UUID> {
    Optional<UserDevice> findByUserAccount(UserAccount userAccount);

    Optional<UserDevice> findByToken(String token);
}
