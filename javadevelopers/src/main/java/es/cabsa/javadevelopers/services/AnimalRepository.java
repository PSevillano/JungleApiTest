package es.cabsa.javadevelopers.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.cabsa.javadevelopers.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{
    
}
