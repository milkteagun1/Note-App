package com.example.notesapp.listeners;

import com.example.notesapp.entities.Notes;

public interface NotesListener {
    void onNoteClicked(Notes notes, int position);
}
