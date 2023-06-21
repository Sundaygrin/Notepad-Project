package com.semicolon.Notepad.repository;

import com.semicolon.Notepad.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
