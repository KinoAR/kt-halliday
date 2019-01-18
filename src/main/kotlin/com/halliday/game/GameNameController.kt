package com.halliday.game

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GameNameController {
    val counter = AtomicLong()
    @GetMapping("/gameName")
    fun gameName(@RequestParam(value = "name", defaultValue = "oasis") name:String) = Game(counter.incrementAndGet(),"$name")
}