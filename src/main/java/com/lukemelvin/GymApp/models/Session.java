package com.lukemelvin.GymApp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.lukemelvin.GymApp.enums.Goal;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private Goal type;

    @Column(name = "trainer")
    private String trainer;

    @Column(name = "room")
    private Integer room;

    @JsonBackReference
    @ManyToMany   (fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            mappedBy = "sessions")
    private Set<Member> members = new HashSet<>();

    public Session(Goal type, String trainer, Integer room){
        this.type = type;
        this.trainer = trainer;
        this.room = room;
    }

    public Session(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Goal getType() {
        return type;
    }

    public void setType(Goal type) {
        this.type = type;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }


    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }
}
