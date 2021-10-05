package com.atheesh.vehiclestore.services.impl;

import com.atheesh.vehiclestore.models.MyUserPrincipal;
import com.atheesh.vehiclestore.models.User;
import com.atheesh.vehiclestore.models.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRolesService userRolesService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("load user by username started " + s);
        Flux<UserRole> userRoleFlux = userRolesService.getAll();
        List<UserRole> userRolesList = userRoleFlux.collectList().block();

        if (userRolesList != null) {
            for (UserRole userRole : userRolesList) {
                if (userRole.getUser().getEmail().equals(s)) {
                    User currentUser = userRole.getUser();
                    System.out.println("user found");
                    currentUser.setPassword(new BCryptPasswordEncoder().encode(currentUser.getPassword()));
                    return new MyUserPrincipal(currentUser);
                }
            }
        }

        return null;
    }
}
