package com.example.authentication_service.service;

import com.example.authentication_service.entity.UserCredentialsEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class CustomUserDetails implements UserDetails {

    private final String name;
    private final String password;
    private final List<SimpleGrantedAuthority> allRoles;
    public CustomUserDetails(UserCredentialsEntity user) {
        this.name = user.getName();
        this.password = user.getPassword();
        this.allRoles = user.getAllRoles().stream().map((role)-> new SimpleGrantedAuthority(role.getRoleName())).toList();
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.allRoles;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.name;
    }
}

