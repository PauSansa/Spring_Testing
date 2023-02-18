package cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.controllers;


import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.domain.Persona;
import cat.itacademy.barcelonactiva.sansaverdu.pau.s04.t02.n02.model.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PersonaControlador {

    @Autowired
    private IPersonaService service;

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("persona", new Persona());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Persona p, Model model) {
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona> personas = service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }
}
