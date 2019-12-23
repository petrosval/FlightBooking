package com.aerotravel.flightticketbooking.services;

import com.aerotravel.flightticketbooking.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User saveUser(User user);

    void deleteUserById(int userId);
}
