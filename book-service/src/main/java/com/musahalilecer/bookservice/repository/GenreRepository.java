package com.musahalilecer.bookservice.repository;

import com.musahalilecer.bookservice.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
