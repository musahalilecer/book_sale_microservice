package com.musahalilecer.bookservice.service.services;

import com.musahalilecer.bookservice.dto.response.BookResponse;
import com.musahalilecer.bookservice.model.Book;

import java.util.List;

public interface BookService {
    public List<BookResponse> getAllBooks();
    public Book getBookById(Long id);
    public  Book addBook(Book book);
    public Book updateBook(Book book);
    public void deleteBook(int id);
}
