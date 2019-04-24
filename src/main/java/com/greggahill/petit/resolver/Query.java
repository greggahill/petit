package com.greggahill.petit.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.greggahill.petit.model.Author;
import com.greggahill.petit.model.Book;
import com.greggahill.petit.repository.AuthorRepository;
import com.greggahill.petit.repository.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }

    public long countAuthors() {
        return authorRepository.count();
    }
}
