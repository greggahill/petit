package com.greggahill.petit.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.greggahill.petit.model.Author;
import com.greggahill.petit.model.Book;
import com.greggahill.petit.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
   private AuthorRepository authorRepository;

   public BookResolver(AuthorRepository authorRepository) {
       this.authorRepository = authorRepository;
   }

   public Author getAuthor(Book book) {
       return authorRepository.findOne(book.getAuthor().getId());
   }
}
