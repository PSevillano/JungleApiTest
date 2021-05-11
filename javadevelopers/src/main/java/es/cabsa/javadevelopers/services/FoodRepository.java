package es.cabsa.javadevelopers.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.cabsa.javadevelopers.model.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{

    //Query to get Food by his name
    @Query(value = "select * from food where name = ?1", nativeQuery = true)
	public Food findFoodByName(String food);
}
