package com.http

import akka.http.scaladsl
import akka.actor.typed.ActorSystem
import actors.GreeterMain

object Server extends App {
  private def main(): Unit = {

    val greeterMain: ActorSystem[GreeterMain.SayHello] = ActorSystem(GreeterMain(), "AkkaQuickStart")
    println(s"Hello from Http package!")
  }

  main()
}
