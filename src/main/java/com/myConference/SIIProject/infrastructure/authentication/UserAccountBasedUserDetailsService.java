package com.myConference.SIIProject.infrastructure.authentication;

import com.myConference.SIIProject.domain.user.account.UserAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class UserAccountBasedUserDetailsService implements UserDetailsService {
    private final UserAccountRepository userAccountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userAccountRepository.findByUsername(username)
            .map(it -> new UserAccountBasedUserDetails(it))
            .orElseThrow(() -> new UsernameNotFoundException("Username not found: " + username));
    }
}
