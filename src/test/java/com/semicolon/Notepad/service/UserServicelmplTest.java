package com.semicolon.Notepad.service;

import com.semicolon.Notepad.dtos.request.UserRegistrationRequest;
import com.semicolon.Notepad.dtos.response.RegistrationResponse;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServicelmplTest {

    @Autowired
    private  UserServicelmpl userServicelmpl;

    @Test
    public void registerUserTest(){
        UserRegistrationRequest userRegistrationRequest = new UserRegistrationRequest();
        userRegistrationRequest.setFirstName("Damian");
        userRegistrationRequest.setLastName("Grin");
        RegistrationResponse response = userServicelmpl.register(userRegistrationRequest);
        assertEquals(response.getMessage(), "Registration Successful !!!");
    }
}