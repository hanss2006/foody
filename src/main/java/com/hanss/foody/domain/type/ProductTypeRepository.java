package com.hanss.foody.domain.type;

import com.hanss.foody.domain.meal.Meal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface ProductTypeRepository extends PagingAndSortingRepository<ProductType, Long> {
    List<ProductType> findByName(@Param("name") String name);
}

