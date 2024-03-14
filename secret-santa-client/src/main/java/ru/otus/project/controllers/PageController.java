package ru.otus.project.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PageController {

    @GetMapping("/secret")
    public String secretPage() {
        System.out.println("зашли в метод secretPage");
        return "secret";
    }

    @GetMapping("/form")
    public String formPage() {
        log.info("зашли в метод formPage");
        return "form";
    }
}
