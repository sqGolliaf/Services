package ru.ivanovds.services.service.impl

import org.springframework.stereotype.Service
import ru.ivanovds.services.repo.BookRepo
import ru.ivanovds.services.service.BookService

@Service
class BookServiceImpl(
    private val repo: BookRepo
) : BookService {

    override fun save() {
        TODO("Not yet implemented")
    }

    override fun getById(id: Int) {
        TODO("Not yet implemented")
    }

    override fun getAll() {
        TODO("Not yet implemented")
    }

    override fun updateById(id: Int) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
    }

}