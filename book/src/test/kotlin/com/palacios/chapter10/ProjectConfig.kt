package com.palacios.chapter10

import com.sun.net.httpserver.HttpServer
import io.kotlintest.ProjectConfig
import java.net.InetSocketAddress
import java.util.concurrent.Executor
import java.util.concurrent.Executors

/*

object MyProjectConfig : ProjectConfig() {

    val server: HttpServer? = null

    override fun beforeAll() {
        var addr  = InetSocketAddress(8080)
        val server = HttpServer.create(addr,0)
        server.executor = Executors.newCachedThreadPool()
        server.start()
        println("Server is listening in port 8080")
    }

    override fun afterAll() {
        println("Server is not longer listening")
        server!!.stop(4)
    }

}

*/