package com.hanss.foody.domain.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {
    List<ProductType> findByName(@Param("name") String name);
}

