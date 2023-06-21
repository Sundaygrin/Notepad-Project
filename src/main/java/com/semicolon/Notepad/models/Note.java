package com.semicolon.Notepad.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Note {

    private String tittle;
    private String body;
    private LocalDateTime dateCreated;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


}
