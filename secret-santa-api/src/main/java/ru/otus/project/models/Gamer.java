package ru.otus.project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
@Table(name = "gamers")
public class Gamer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String gender;

    @OneToMany(targetEntity = Answer.class,
            mappedBy = "gamer",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<Answer> answers;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "letter_id", referencedColumnName = "id")
    private Letter letter;

    @OneToOne
    @JoinColumn(name = "id")
    private Gamer targetGamer;
}
