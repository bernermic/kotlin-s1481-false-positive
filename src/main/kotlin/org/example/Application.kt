package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Application

@SuppressWarnings("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

fun unusedVarFalsePositive() {
    val value = "not-unused"
    val map = hashMapOf<String, String>()
    map["used"] = value
}
