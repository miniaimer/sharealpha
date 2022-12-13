package com.playground.share;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class NoteShare {
    static String URL = "content://com.playground.architecture.provider.NoteContentProvider/note_database";
    static Uri CONTENT_URI  = Uri.parse(URL);
    static String VALUE = "note";
    static public void UpdateCoins(Activity activity, long coinValue){
        ContentValues newValues = new ContentValues();
        newValues.put(VALUE, coinValue);
        activity.getContentResolver().update(CONTENT_URI,newValues,null,null);
    }
    static public String InsertNote(Activity activity, Note note){
        ContentValues newValues = new ContentValues();
        newValues.put("Id", note.getId());
        newValues.put("Title", note.getTitle());
        newValues.put("Description", note.getDescription());
        newValues.put("Timestamp", note.getTimeStamp());
        try {
            activity.getContentResolver().insert(CONTENT_URI,newValues);
            return "Note added";
        }catch (Exception e){
            return e.getMessage();
        }


    }
    static public List<Note> GetNotes(Activity activity){
        Cursor c = activity.getContentResolver().query(CONTENT_URI, null, null, null, null);
        List<Note> notes = new ArrayList<>();
        try {
            if (c.moveToFirst()) {
                do {
                    Note note = new Note();
                    note.setId(c.getInt(0));
                    note.setTimeStamp(c.getLong(1));
                    note.setTitle(c.getString(2));
                    note.setDescription(c.getString(3));
                    notes.add(note);
                } while (c.moveToNext());
            }
            return notes;
        }catch (Exception e){
            return notes;
        }
    }
}
