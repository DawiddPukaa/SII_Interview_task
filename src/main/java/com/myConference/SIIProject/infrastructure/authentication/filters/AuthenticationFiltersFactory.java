package com.myConference.SIIProject.infrastructure.authentication.filters;

import com.myConference.SIIProject.infrastructure.authentication.filters.pwd.UsernameAndPasswordAuthenticationFilter;
import com.myConference.SIIProject.infrastructure.authentication.filters.pwd.UsernameAndPasswordFromFormParamAuthenticationConverter;
import com.myConference.SIIProject.infrastructure.authentication.filters.token.TokenAuthenticationConverter;
import com.myConference.SIIProject.infrastructure.authentication.filters.token.TokenAuthenticationFilter;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthenticationFiltersFactory {
    private final TokenAuthenticationConverter tokenAuthenticationConverter;
    private final UsernameAndPasswordFromFormParamAuthenticationConverter usernameAndPasswordFromFormParamAuthenticationConverter;

    public TokenAuthenticationFilter createTokenAuthenticationFilter(AuthenticationManager authenticationManager, String path) {
        return new TokenAuthenticationFilter(authenticationManager, tokenAuthenticationConverter, path);
    }

    public UsernameAndPasswordAuthenticationFilter createUsernameAndPasswordAuthenticationFilter(AuthenticationManager authenticationManager, String path) {
        return new UsernameAndPasswordAuthenticationFilter(authenticationManager, usernameAndPasswordFromFormParamAuthenticationConverter, path);
    }
}

