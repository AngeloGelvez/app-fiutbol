package com.club_deportivo.app.controller.rest;

import com.club_deportivo.app.Repositories.AsociacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/asociacion")
public class AsociacionRestController {

    @Autowired
    private AsociacionRepository asociacionRepository;
}
