package com.tomatoa.service.models;


import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long Id;

    @Column(name = "channels")
    @ManyToMany
    private List<Channel> channels;

    public static Member getMember(Long id) {
        return new Member();
    }
}
