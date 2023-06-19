package com.devsuperior.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.model.User;
import com.devsuperior.dslearnbds.repository.UserRepository;
import com.devsuperior.dslearnbds.services.exceptions.ForbidenException;
import com.devsuperior.dslearnbds.services.exceptions.UnauthorizedException;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public User authenticated() {

        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username);
        } catch (Exception e) {
            // TODO: handle exception

            throw new UnauthorizedException("Invalid User");
        }

    }

    public void validateSelfOrAdmin(Long userId) {
        User user = authenticated();

        if (user.getId() != userId && !user.hasHole("ROLE_ADMIN")) {
            throw new ForbidenException("Access Denied");
        }

    }

}
