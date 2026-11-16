
package com.test.wikiapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WikiController {

    @GetMapping("/wiki")
    public String showWiki(Model model) {

        model.addAttribute("title", "My Wiki Application");

        model.addAttribute(
            "message",
            "Welcome to my first dynamic Wiki page!"
        );

        return "wiki";
    }
}