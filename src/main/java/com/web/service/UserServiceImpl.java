package com.web.service;

import com.web.model.Role;
import com.web.model.User;
import com.web.repository.UserRepository;
import com.web.web.dto.UserRegestationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

import static com.fasterxml.jackson.databind.type.LogicalType.Array;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegestationDto regestationDto) {
        User user = new User(regestationDto.getFirstName(),
                regestationDto.getLastName(),
                regestationDto.getEmail(),
                regestationDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

}
