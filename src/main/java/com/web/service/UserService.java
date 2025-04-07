package com.web.service;

import com.web.model.User;
import com.web.web.dto.UserRegestationDto;

public interface UserService {
    User save(UserRegestationDto regestationDto);
}
