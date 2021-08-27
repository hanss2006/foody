package com.hanss.foody.domain.meal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@Repository
public interface MealProductRepository extends JpaRepository<MealProduct, Long> {
    List<MealProduct> findByMealId(Long mealId);
}