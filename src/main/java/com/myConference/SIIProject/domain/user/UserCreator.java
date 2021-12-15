package com.myConference.SIIProject.domain.user;

import com.myConference.SIIProject.domain.user.account.*;
import com.myConference.SIIProject.infrastructure.clock.ClockProvider;
import lombok.AllArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Component
public class UserCreator {
    private final UserAccountRepository userAccountRepository;
    private final PasswordEncoder passwordEncoder;
    private final ClockProvider clockProvider;
    private final UserAccountAssignedRoleRepository userAccountAssignedRoleRepository;

    public UserAccount create(CreateUserCommand createUserCommand) {
        UserAccount createdUser = userAccountRepository.save(UserAccount.builder()
                .name(createUserCommand.name)
                .secondName(createUserCommand.secondName)
                .username(createUserCommand.username)
                .password(passwordEncoder.encode(createUserCommand.password))
                .registeredAt(clockProvider.instant())
                .isExpired(false)
                .isAccountLocked(false)
                .isCredentialsExpired(false)
                .isEnabled(true)
                .build());

        UserAccountAssignedRole build = UserAccountAssignedRole.builder()
            .role(UserAccountRole.REGULAR)
            .userAccount(createdUser)
            .build();
        UserAccountAssignedRole userAccountAssignedRole = userAccountAssignedRoleRepository.save(build);

        createdUser.setRoles(new HashSet<>(Set.of(userAccountAssignedRole)));
        return userAccountRepository.save(createdUser);
    }
}
