package es.cabsa.javadevelopers.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.cabsa.javadevelopers.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{

    //Query to get Animal by his name
    @Query(value = "select * from animal where name = ?1", nativeQuery = true)
	public Animal findAnimalByName(String animal);

    //Query for a list of animals that begin with the letter C
    @Query(value = "select * from animal where name like 'C%'", nativeQuery = true)
	public List<Animal> animalList();
    
}
