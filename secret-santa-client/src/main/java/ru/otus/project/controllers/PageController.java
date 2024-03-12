package ru.otus.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/secret")
    public String secretPage() {
        return "secret";
    }
}
