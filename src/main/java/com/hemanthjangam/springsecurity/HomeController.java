package com.hemanthjangam.springsecurity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String sayHello(HttpServletRequest request, HttpServletResponse response) {
        return "Session ID: " + request.getSession().getId() + " Response status: " + response.getStatus();
    }
}
