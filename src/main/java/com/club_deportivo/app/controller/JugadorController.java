package com.club_deportivo.app.controller;

import com.club_deportivo.app.Entities.Jugador;
import com.club_deportivo.app.Repositories.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jugador")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @GetMapping()
    public String home(Model model) {
        model.addAttribute("jugadores", jugadorRepository.findAll());
        return "jugador.html";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("jugador", new Jugador());
        return "form-jugador.html";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("jugador", jugadorRepository.findById(id));
        return "form-jugador.html";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("jugador") Jugador jugador) {
        if(jugador.getJugador_id().isEmpty()) {
            jugador.setJugador_id(null);
        }

        jugadorRepository.save(jugador);
        return "redirect:/jugador";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        jugadorRepository.deleteById(id);
        return "redirect:/jugador";
    }
}
