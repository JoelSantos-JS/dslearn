package com.devsuperior.dslearnbds.services.exceptions;

import org.slf4j.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devsuperior.dslearnbds.model.User;
import com.devsuperior.dslearnbds.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(UserService.class);

    private UserRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        User user = ur.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Email not found");
        }

        System.out.println("Username" + username);

        return user;

    }
}
