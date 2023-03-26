package org.bedu.java.backend.e7.controller;


import javax.validation.Valid;

import org.bedu.java.backend.e7.model.Persona;
import org.bedu.java.backend.e7.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgendaController {

    private final AgendaService agendaService;

    @Autowired
    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @GetMapping({"/", "/index"})
    public String formularioRegistro(Model model) {
        model.addAttribute("persona", new Persona());
        model.addAttribute("listaPersonas", agendaService.getPersonas());

        return "index";
    }

    @PostMapping("/registro")
    public ModelAndView registra(@Valid Persona persona, Errors errors) {
        
        if (!errors.hasErrors()) {
            agendaService.guardaPersona(persona);
        }


        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listaPersonas", agendaService.getPersonas());
        return mav;
    }
}
