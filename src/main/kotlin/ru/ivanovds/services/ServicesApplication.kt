package ru.ivanovds.services

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ServicesApplication

fun main(args: Array<String>) {
	runApplication<ServicesApplication>(*args)
}

@RestController
class GreetingController {

	@GetMapping("/")
	fun greetings(): String = "Hello from services!"
}