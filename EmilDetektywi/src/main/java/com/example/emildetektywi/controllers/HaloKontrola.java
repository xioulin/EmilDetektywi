package com.example.emildetektywi.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HaloKontrola {


    @GetMapping("/halo")
    public String halo(){
        return "czesc";
    }
    @GetMapping("/halo/{nazwisko}")
    public String witajKolego(@PathVariable String nazwisko, Model model) {
        model.addAttribute("nazwisko",nazwisko);
        return "czesc";
    }



}
