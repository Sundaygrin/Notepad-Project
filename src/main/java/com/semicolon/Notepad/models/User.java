package com.semicolon.Notepad.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;




}
