package com.club_deportivo.app.controller;

import com.club_deportivo.app.Entities.Entrenador;
import com.club_deportivo.app.Repositories.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/entrenador")
public class EntrenadorController {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    @GetMapping()
    public String home(Model model) {
        model.addAttribute("entrenadores", entrenadorRepository.findAll());
        return "entrenador.html";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("entrenador", new Entrenador());
        return "form-entrenador.html";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("entrenador", entrenadorRepository.findById(id));
        return "form-entrenador.html";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("entrenador") Entrenador entrenador) {
        if(entrenador.getEntrenador_id().isEmpty()) {
            entrenador.setEntrenador_id(null);
        }

        entrenadorRepository.save(entrenador);
        return "redirect:/entrenador";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        entrenadorRepository.deleteById(id);
        return "redirect:/entrenador";
    }
}
