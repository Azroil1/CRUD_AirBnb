package ru.manyanov.CRUD_AirBnb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.manyanov.CRUD_AirBnb.models.Flat;
import ru.manyanov.CRUD_AirBnb.servises.FlatServise;

@Controller
public class FlatController {
    private final FlatServise flatServise;
    @Autowired
    public FlatController(FlatServise flatServise) {
        this.flatServise = flatServise;
    }

    @GetMapping("/")
    public String sayHello(){
        return "index";
    }
    @GetMapping("/flat")
    public String flats(Model model) {
        model.addAttribute("flat", flatServise.findAll());
        System.out.println(flatServise.findAll());
        return "flat";
    }

    @GetMapping("/flat/{id}")
    public String thisFlat(@ModelAttribute("flat") Flat flat, Model model){
        model.addAttribute("flat",flatServise.findById(flat.getId()));
        return "thisFlat";
    }

    @GetMapping("/flat/new")
    public String newFlat(@ModelAttribute("flat") Flat flat) {
        return "new";
    }


    @PostMapping("/flat/new")
    public String create(@ModelAttribute("flat") Flat flat, BindingResult result,Model model) {
        flatServise.save(flat);
        return "redirect:/flat";
    }
}
