package com.club_deportivo.app.controller;

import com.club_deportivo.app.Entities.Competicion;
import com.club_deportivo.app.Repositories.CompeticionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/competicion")
public class CompeticionController {

    @Autowired
    private CompeticionRepository competicionRepository;

    @GetMapping()
    public String home(Model model) {
        model.addAttribute("competiciones", competicionRepository.findAll());
        return "competicion.html";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("competicion", new Competicion());
        return "form-competicion.html";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("competicion", competicionRepository.findById(id));
        return "form-competicion.html";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("competicion") Competicion competicion) {
        if(competicion.getCompeticion_id().isEmpty()) {
            competicion.setCompeticion_id(null);
        }

        competicionRepository.save(competicion);
        return "redirect:/competicion";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        competicionRepository.deleteById(id);
        return "redirect:/competicion";
    }
}
