package io.github.jawherkassas.librarymanagement.repository;


import io.github.jawherkassas.librarymanagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}