package com.tomatoa.service.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @deprecated
 */
@Entity
@Getter
@Setter
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
