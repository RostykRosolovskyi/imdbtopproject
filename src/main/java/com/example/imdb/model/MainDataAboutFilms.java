package com.example.imdb.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MainDataAboutFilms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double rating;
    private String description;

}
