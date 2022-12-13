package com.playground.share;

public class Note {
    Integer id;
    Long TimeStamp;
    String Title;
    String Description;

    public Note() {
    }

    public Note(Integer id, Long timeStamp, String title, String description) {
        this.id = id;
        TimeStamp = timeStamp;
        Title = title;
        Description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
