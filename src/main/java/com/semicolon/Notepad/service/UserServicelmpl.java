package com.semicolon.Notepad.service;

import com.semicolon.Notepad.dtos.request.UserRegistrationRequest;
import com.semicolon.Notepad.dtos.response.RegistrationResponse;
import com.semicolon.Notepad.models.User;
import com.semicolon.Notepad.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServicelmpl implements UserService{


    private UserRepository userRepository ;


    public RegistrationResponse register(UserRegistrationRequest userRegistrationRequest) {
        User user = new User();
        user.setFirstName(userRegistrationRequest.getFirstName());
        user.setLastName(userRegistrationRequest.getLastName());
        user.setEmail(userRegistrationRequest.getEmail());
        user.setPassword(userRegistrationRequest.getPassword());
        userRepository.save(user);
        RegistrationResponse registerResponse = new RegistrationResponse();
        registerResponse.setMessage("Registration Successful !!!");
        return registerResponse;
    }

}
