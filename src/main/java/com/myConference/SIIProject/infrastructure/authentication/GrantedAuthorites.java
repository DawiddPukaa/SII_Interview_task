package com.myConference.SIIProject.infrastructure.authentication;

import com.myConference.SIIProject.domain.user.account.UserAccountRole;
import org.springframework.security.core.GrantedAuthority;


public enum GrantedAuthorites implements GrantedAuthority {
    REGULAR("ROLE_REGULAR");

    private final String authority;

    GrantedAuthorites(String authority) {
        this.authority = authority;
    }

    public static GrantedAuthority from(UserAccountRole userAccountRole) {
        switch (userAccountRole) {
            case REGULAR:
                return GrantedAuthorites.REGULAR;
            default:
                throw new UnsupportedOperationException("Unsupported role: " + userAccountRole);
        }
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
