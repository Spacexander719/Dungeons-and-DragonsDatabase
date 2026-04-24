package com.dnd.charactercreator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/characters")
    public String dashboard() {
        return "characters/dashboard";
    }
}
