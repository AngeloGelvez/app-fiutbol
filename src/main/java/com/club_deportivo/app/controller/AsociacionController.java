package com.club_deportivo.app.controller;

import com.club_deportivo.app.Entities.Asociacion;
import com.club_deportivo.app.Repositories.AsociacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/asociacion")
public class AsociacionController {

    @Autowired
    private AsociacionRepository asociacionRepository;

    @GetMapping()
    public String home(Model model) {
        model.addAttribute("asociaciones", asociacionRepository.findAll());
        //System.out.println(asociacionRepository.findAll().size());
        return "asociacion.html";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("asociacion", new Asociacion());
        return "form-asociacion.html";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("asociacion", asociacionRepository.findById(id));
        return "form-asociacion.html";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("asociacion") Asociacion asociacion) {
        if(asociacion.getAsociacion_id().isEmpty()) {
            asociacion.setAsociacion_id(null);
        }

        asociacionRepository.save(asociacion);
        return "redirect:/asociacion";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        asociacionRepository.deleteById(id);
        return "redirect:/asociacion";
    }
}
