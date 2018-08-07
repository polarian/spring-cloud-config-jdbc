package io.polarian.config.server

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "service-client")
interface MyFeignClient {
    @GetMapping("say/{msg}")
    fun say(@PathVariable msg: String): String
}
