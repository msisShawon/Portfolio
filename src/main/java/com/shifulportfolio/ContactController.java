package com.shifulportfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @GetMapping("/contact-us")
    public String contactPage(){
        return "contact";
    }

    @PostMapping("contact-us")
    public String submitContact(@RequestParam String user_name, @RequestParam String user_email,@RequestParam String message){
        System.out.println("Contact Submitted");
        System.out.println("Name: "+user_name);
        System.out.println("Email: "+user_email);
        System.out.println("Message: "+message);
        return "contact";
    }


}
