package com.rsikspr.labos.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "message", schema = "public")
public class Message {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Column(name = "author")
    private String author;

    @Getter
    @Column(name = "message")
    private String message;

}
