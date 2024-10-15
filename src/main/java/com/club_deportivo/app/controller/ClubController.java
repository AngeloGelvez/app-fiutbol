package com.club_deportivo.app.controller;

import com.club_deportivo.app.Entities.Club;
import com.club_deportivo.app.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/club")
public class ClubController {

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private AsociacionRepository asociacionRepository;

    @Autowired
    private CompeticionRepository competicionRepository;

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

    @GetMapping()
    public String home(Model model) {
        model.addAttribute("clubes", clubRepository.findAll());
        return "club.html";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("club", new Club());

        model.addAttribute("asociaciones", asociacionRepository.findAll());
        model.addAttribute("competiciones", competicionRepository.findAll());
        model.addAttribute("entrenadores", entrenadorRepository.findAll());
        model.addAttribute("jugadores", jugadorRepository.findAll());

        return "form-club.html";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("club", clubRepository.findById(id));
        return "form-club.html";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("club") Club club) {
        if(club.getClub_id().isEmpty()) {
            club.setClub_id(null);
        }

        clubRepository.save(club);
        return "redirect:/club";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        clubRepository.deleteById(id);
        return "redirect:/club";
    }
}
