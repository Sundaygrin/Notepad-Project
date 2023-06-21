package com.semicolon.Notepad.dtos.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
