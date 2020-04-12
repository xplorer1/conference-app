package com.pluralsight.conference.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="speakers", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long speaker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String speaker_bio;
    private String company;

    public Speaker() {};

    @Lob //for handling binary data fields
    @Type(type="org.hibernate.type.BinaryType")
    private byte [] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore //prevents looping of many to many mapping.
    private List<Session> sessions;

    public List<Session> getSessions() {
        return sessions;
        //return null;
    }

    public void setSessions(List<Session> sessions) {

        this.sessions = sessions;
    }

    public Long getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(Long speaker_id) {
        this.speaker_id = speaker_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBio() {
        return speaker_bio;
    }

    public void setBio(String bio) {
        this.speaker_bio = bio;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
