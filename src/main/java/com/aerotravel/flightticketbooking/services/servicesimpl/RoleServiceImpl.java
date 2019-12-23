package com.aerotravel.flightticketbooking.services.servicesimpl;

import com.aerotravel.flightticketbooking.model.Role;
import com.aerotravel.flightticketbooking.repository.RoleRepository;
import com.aerotravel.flightticketbooking.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getRoleById(Integer roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }
}
