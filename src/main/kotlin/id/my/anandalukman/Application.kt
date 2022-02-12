package id.my.anandalukman

import io.ktor.application.*
import id.my.anandalukman.plugins.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
        // ...
    }.start(wait = true)
    configureRouting()
    configureSerialization()
    configureMonitoring()
}
