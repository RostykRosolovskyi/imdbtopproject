package com.example.imdb.repository;

import com.example.imdb.model.MainDataAboutFilms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBase extends JpaRepository<MainDataAboutFilms,Long> {
}
