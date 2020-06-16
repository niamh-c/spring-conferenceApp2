package com.niamh.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity(name="speakers")
//To prevent serialising lazy/eager loading
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter @Setter
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long speaker_id;
    private String first_name;
    private String last_name;
    private String title;
    private String company;
    private String speaker_bio;

    @Lob //large object
    @Type(type = "org.hibernate.type.BinaryType") //deal with special types
    private byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore //to prevent cyclical problem. Prevent back-serialisation back to sessions

    private List<Session> sessions;

    public Speaker(){

    }
}
