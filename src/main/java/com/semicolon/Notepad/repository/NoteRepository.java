package com.semicolon.Notepad.repository;

import com.semicolon.Notepad.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository  extends JpaRepository<Note,Long > {
}
