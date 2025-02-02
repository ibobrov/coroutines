package ru.bobrov.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoroutinesApplication : CommandLineRunner {

    override fun run(vararg args: String?) {
        runBlocking {
            launch { simulateLoading() }
        }
    }

    suspend fun simulateLoading() {
        for (i in 1..100) {
            println("Loading $i%")
            delay(100)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<CoroutinesApplication>(*args)
}
