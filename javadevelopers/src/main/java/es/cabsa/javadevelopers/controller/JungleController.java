package es.cabsa.javadevelopers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cabsa.javadevelopers.services.AnimalRepository;
import es.cabsa.javadevelopers.services.FoodRepository;

@RestController
@RequestMapping("/jungle")
public class JungleController {

    @Autowired
    public AnimalRepository animalRepository;
    @Autowired
    public FoodRepository foodRepository;

    
    
}
