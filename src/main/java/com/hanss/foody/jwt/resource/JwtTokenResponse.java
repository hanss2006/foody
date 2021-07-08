package com.hanss.foody.jwt.resource;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.Collection;

@Data
public class JwtTokenResponse implements Serializable {

  private static final long serialVersionUID = 8317676219297719109L;

  private final String token;

  private final String[] roles;

 private final String expiration;
    public JwtTokenResponse(String token, Collection<? extends GrantedAuthority>  roles, String expiration) {
        this.token = token;

        String[] roleArray = new String[roles.size()];

        for (int i = 0; i < roles.size(); i++) {
            roleArray[i] = roles.iterator().next().getAuthority();
        }
        this.roles = roleArray;
        this.expiration = expiration;
    }
}
