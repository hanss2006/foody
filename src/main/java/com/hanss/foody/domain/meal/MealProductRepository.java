package com.hanss.foody.domain.meal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
public interface MealProductRepository extends JpaRepository<MealProduct, MealProductPK> {
}