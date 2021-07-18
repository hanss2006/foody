package com.hanss.foody.domain.unit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface UnitRepository extends JpaRepository<Unit, Long> {
    List<Unit> findByName(@Param("name") String name);
}
