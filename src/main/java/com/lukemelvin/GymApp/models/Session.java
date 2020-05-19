package com.lukemelvin.GymApp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "trainer")
    private String trainer;

    @Column(name = "room")
    private Integer room;

    @JsonBackReference
    @ManyToMany
    @JoinTable(
            name = "bookings",
            joinColumns = @JoinColumn(name = "sessionId"),
            inverseJoinColumns = @JoinColumn(name = "memberId"))
    private Set<Member> bookedMembers;

}
