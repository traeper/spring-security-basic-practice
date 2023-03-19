package com.traeper.spring.security.practice.basic.application

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping("/", "/home")
    fun home() : String {
        return "index"
    }

    @GetMapping("/login")
    fun login() : String {
        return "index"
    }
}