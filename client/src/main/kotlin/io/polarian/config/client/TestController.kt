package io.polarian.config.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(val dataSourceProperties: DataSourceProperties) {
    @Value("\${server.port}")
    lateinit var serverPort:String

    @GetMapping("/db")
    fun getDb():DataSourceProperties {
        return dataSourceProperties
    }

    @GetMapping("/port")
    fun getPort():String {
        return serverPort
    }
}
