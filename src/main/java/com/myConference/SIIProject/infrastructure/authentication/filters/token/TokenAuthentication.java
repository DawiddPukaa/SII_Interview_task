package com.myConference.SIIProject.infrastructure.authentication.filters.token;

import com.myConference.SIIProject.domain.user.account.UserAccount;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;


import java.util.Collection;

public class TokenAuthentication extends AbstractAuthenticationToken {
    final UserAccount userAccount;
    final String token;

    public TokenAuthentication(UserAccount userAccount, String token, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        this.userAccount = userAccount;
        this.token = token;
    }

    public TokenAuthentication(String token) {
        super(null);

        if (token == null || token.length() > 160) throw new IllegalArgumentException("Invalid token");

        this.userAccount = null;
        this.token = token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    @Override
    public Object getPrincipal() {
        return userAccount;
    }
}
