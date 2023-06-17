package com.devsuperior.dslearnbds.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson {

    public String textContext;
    public String videoUri;

    public Content() {
    }

    public Content(long id, String title, Integer position, Section section, String textContext, String videoUri) {
        super(id, title, position, section);
        this.textContext = textContext;
        this.videoUri = videoUri;

    }

    public String getTextContext() {
        return textContext;
    }

    public void setTextContext(String textContext) {
        this.textContext = textContext;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }

}