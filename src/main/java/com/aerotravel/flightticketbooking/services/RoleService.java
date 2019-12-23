package com.aerotravel.flightticketbooking.services;

import com.aerotravel.flightticketbooking.model.Role;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface RoleService {

    public abstract Role saveRole(Role role);
    public abstract Role getRoleById(Integer roleId);
}
