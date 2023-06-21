package com.semicolon.Notepad.service;

import com.semicolon.Notepad.dtos.request.UserRegistrationRequest;
import com.semicolon.Notepad.dtos.response.RegistrationResponse;

public interface UserService {
    public RegistrationResponse register(UserRegistrationRequest userRegistrationRequest);
}
