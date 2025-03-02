package com.musahalilecer.bookservice.service.services;

import com.musahalilecer.bookservice.dto.request.AuthorRequest;
import com.musahalilecer.bookservice.dto.response.AuthorResponse;
import com.musahalilecer.bookservice.model.Author;

import java.util.List;

public interface AuthorService {
    public List<AuthorResponse> getAllAuthors();
    public Author getAuthorById(int id);
    public Author addAuthor(AuthorRequest authorRequest);
    public Author updateAuthor(AuthorRequest authorRequest);
    public void deleteAuthor(int id);
}
