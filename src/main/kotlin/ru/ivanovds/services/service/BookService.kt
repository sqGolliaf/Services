package ru.ivanovds.services.service

interface BookService {
    fun save()

    fun getById(id: Int)

    fun getAll()

    fun updateById(id: Int)

    fun delete(id: Int)
}