package com.musahalilecer.bookservice.repository;

import com.musahalilecer.bookservice.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
