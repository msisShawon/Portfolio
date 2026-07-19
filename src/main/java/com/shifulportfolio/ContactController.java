package com.shifulportfolio;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ContactController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/projects")
    public String projects() {
        return "project";
    }

    @GetMapping("/services")
    public String services() {
        return "service";
    }

    @GetMapping("/contacts-us")
    public String contactPage(){
        return "contact";
    }

    @PostMapping("/submit-form")
    public String submitContact(@ModelAttribute Contact contact){
        log.info("Contact Form Submitted {}", contact);
        return "redirect:/contacts-us";
    }


}
