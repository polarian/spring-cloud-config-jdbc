package io.polarian.config.server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("say")
class TestController(val myFeignClient: MyFeignClient) {
    @GetMapping("{msg}")
    fun say(@PathVariable msg: String): String {
        return myFeignClient.say(msg)
    }
}