package es.cabsa.javadevelopers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cabsa.javadevelopers.model.Animal;
import es.cabsa.javadevelopers.model.Food;
import es.cabsa.javadevelopers.services.AnimalRepository;
import es.cabsa.javadevelopers.services.FoodRepository;

@RestController
public class JungleController {

    @Autowired
    public AnimalRepository animalRepository;
    @Autowired
    public FoodRepository foodRepository;

    /**
     * Method to create a new food
     * @param food
     * @return
     */
    @PostMapping("/createFood")
    public Food createFood(@RequestBody Food food) {
    	return foodRepository.save(food);
    }

    /**
     * Get animal by name
     * @param name
     * @return
     */
    @GetMapping("/getAnimalByName/{name}")
    public Animal getAnimalByName(@PathVariable(value = "name") String name) {
        return animalRepository.findAnimalByName(name);
    }

    /**
     * Get food by name
     * @param name
     * @return
     */
    @GetMapping("/getFoodByName/{name}")
    public Food getFoodById(@PathVariable(value = "name") String name) {
        return foodRepository.findFoodByName(name);
    }

    



    
}
