package ru.ivanovds.services.model

import jakarta.persistence.*

@Entity
@Table(name = "author")
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "full_name", nullable = true)
    val fullName: String? = null
)