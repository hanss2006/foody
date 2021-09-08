package com.hanss.foody.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(@Param("name") String name);

    List<Product> findByNameContainingIgnoreCase(String name);
}

