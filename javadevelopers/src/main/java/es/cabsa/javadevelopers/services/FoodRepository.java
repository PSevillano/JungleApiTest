package es.cabsa.javadevelopers.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.cabsa.javadevelopers.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{
    
}
