package ru.ivanovds.services.repo

import org.springframework.data.jpa.repository.JpaRepository
import ru.ivanovds.services.model.Book

interface BookRepo: JpaRepository<Book, Int>