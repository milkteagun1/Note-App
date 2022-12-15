package com.example.notesapp.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.notesapp.entities.Notes;

import java.util.List;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM noteApp ORDER BY id DESC")
    List<Notes> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Notes noteApp);

    @Delete
    void deleteNote(Notes noteApp);

}
