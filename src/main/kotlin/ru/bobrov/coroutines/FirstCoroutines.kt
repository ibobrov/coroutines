package ru.bobrov.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
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
