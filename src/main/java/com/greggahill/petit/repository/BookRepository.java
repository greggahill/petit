package com.greggahill.petit.repository;

import com.greggahill.petit.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
