package ru.job4j.middle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MiddleApplication

fun main(args: Array<String>) {
    runApplication<MiddleApplication>(*args)
}
