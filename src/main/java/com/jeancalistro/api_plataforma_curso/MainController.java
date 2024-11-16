package com.jeancalistro.api_plataforma_curso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class MainController {
    
    @GetMapping
    public String root() {
        return "Main";
    }
}
