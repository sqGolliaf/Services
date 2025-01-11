package ru.ivanovds.services.model

import jakarta.persistence.*

@Entity
@Table(name = "book")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "description", nullable = true)
    val description: String? = null,

    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = true)
    val author: Author? = null
)
