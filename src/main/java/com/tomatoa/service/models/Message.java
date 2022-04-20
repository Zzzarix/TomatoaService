package com.tomatoa.service.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "content")
    private String content;

    @Column(name = "authorId")
    private Integer authorId;
}
