package ru.ivanovds.services.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.ivanovds.services.service.BookService

@RestController
@RequestMapping("/api/v1/book")
class BookController(
    private val service: BookService
) {

    @GetMapping
    fun findAll() = service.getAll()
}