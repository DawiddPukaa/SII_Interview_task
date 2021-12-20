package com.myConference.SIIProject.domain.user;

import
        com.myConference.SIIProject.domain.user.account.UserAccount;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CurrentUserProvider {
    public UserAccount getCurrentUser() {
        return (UserAccount) SecurityContextHolder.getContext()
            .getAuthentication()
            .getPrincipal();
    }
}
