package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/about") {
            call.respondText("This is Split ease!")
        }
        route("{...}") {
            handle {
                call.respond(HttpStatusCode.NotFound, "404 Not Found")
            }
        }
    }
}
