package com.http

import akka.actor
import akka.actor.typed.scaladsl.{ActorContext, Behaviors}
import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.http.scaladsl.Http
import com.http.actors.GreeterMain
import com.http.actors.GreeterMain.SayHello

object Server extends App {
    println(s"Hello from Http package!")

    private val greeterMain: ActorSystem[SayHello] =
      ActorSystem(GreeterMain(), "Server")

    greeterMain ! SayHello("Joshua")
}

object HttpActor {
  val system = actor.ActorSystem()
  val executionContext = system.dispatcher

}
