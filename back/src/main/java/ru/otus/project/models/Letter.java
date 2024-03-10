package ru.otus.project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "letters")
public class Letter {

    @Id
    private Long id;

    private String letterText;

    @OneToOne(mappedBy = "letter")
    private Gamer gamer;
}
