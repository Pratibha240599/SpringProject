package com.smart.config;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.smart.entities.User;

public class CustomUserDetails implements UserDetails{
    private User user;

    public CustomUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(user.getRole());
        List<GrantedAuthority> r = new ArrayList<>();
        r.add(simpleGrantedAuthority);
        return r;
    }

    @Override
    public String getPassword() {
        //throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        //throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        //throw new UnsupportedOperationException("Unimplemented method 'isAccountNonExpired'");
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        //throw new UnsupportedOperationException("Unimplemented method 'isAccountNonLocked'");
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        //throw new UnsupportedOperationException("Unimplemented method 'isCredentialsNonExpired'");
        return true;
    }

    @Override
    public boolean isEnabled() {
        //throw new UnsupportedOperationException("Unimplemented method 'isEnabled'");
        return true;        
    }
    
}
