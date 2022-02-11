package id.my.anandalukman.plugins

import id.my.anandalukman.route.randomGirl
import io.ktor.routing.*
import io.ktor.http.content.*
import io.ktor.application.*

fun Application.configureRouting() {
    routing {
        randomGirl()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
