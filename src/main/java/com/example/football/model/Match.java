package com.example.football.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String homeTeam;
    private String awayTeam;

    @Column(name="match_date")
    private String data;
}
