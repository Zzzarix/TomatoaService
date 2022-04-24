package com.tomatoa.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "type")
    private Channels type;

    @Column(name = "messages")
    @OneToMany
    private ArrayList<Message> messages;

    @Column(name = "members")
    @ManyToMany
    private List<Member> members;

    public static Member getMember(Long id) {
        return new Member();
    }
}
