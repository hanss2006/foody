package com.hanss.foody.domain.meal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;


@CrossOrigin
public interface MealRepository extends JpaRepository<Meal, Long> {
    List<Meal> findByName(@Param("name") String name);

    @Query("select m from Meal m left join m.products products where products.id = ?1")
    List<Meal> findByProductTypeId(Long id);

    List<Meal> findByNameContainingIgnoreCase(String name);
}