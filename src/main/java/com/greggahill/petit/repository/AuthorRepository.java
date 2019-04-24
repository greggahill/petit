package com.greggahill.petit.repository;

import com.greggahill.petit.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
