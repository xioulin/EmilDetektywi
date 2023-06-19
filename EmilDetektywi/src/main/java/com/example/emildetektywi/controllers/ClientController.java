package com.example.emildetektywi.controllers;


import com.example.emildetektywi.models.Client;
import com.example.emildetektywi.repository.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    private final ClientRepository clientRepo;

    public ClientController(ClientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("clients", clientRepo.findAll());
        return "clients/index";
    }

    @GetMapping("/clients/create")
    public String showCreateForm(Model model){
        model.addAttribute("client",new Client());
        return "clients/create";
    }
    @PostMapping("/clients/create")
    public String create(@ModelAttribute Client client) {
        client.setName();
        client.getMembershipCat();
        return "redirect:/index";
    }
}
