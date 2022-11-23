package com.jpa.exercies.repository;

import com.jpa.exercies.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
