package id.my.anandalukman.plugins

import io.ktor.serialization.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

/**
 * Set of ApplicationContent Json
 */

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}