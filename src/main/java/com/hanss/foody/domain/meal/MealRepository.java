package com.hanss.foody.domain.meal;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;


@CrossOrigin
public interface MealRepository extends PagingAndSortingRepository<Meal, Long> {
    List<Meal> findByName(@Param("name") String name);
}