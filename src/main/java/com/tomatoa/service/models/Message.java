package com.tomatoa.service.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "content")
    private String content;

    @Column(name = "authorId")
    private Long authorId;

    @Column(name = "chanId")
    private Long chanId;
}
