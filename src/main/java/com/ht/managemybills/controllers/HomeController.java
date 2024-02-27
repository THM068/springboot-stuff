package com.ht.managemybills.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/secure")
public class HomeController {

  @GetMapping
  public String home(Model model) {
    model.addAttribute("pageTitle", "Taming Thymeleaf");
    model.addAttribute("children", List.of("Thomas", "Alexandra", "Christopher"));

    return "index";
  }
}
