package com.video.rental.userinterface.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class HomeController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index Page");
        //model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}