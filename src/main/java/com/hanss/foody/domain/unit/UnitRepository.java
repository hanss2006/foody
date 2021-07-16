package com.hanss.foody.domain.unit;

import com.hanss.foody.domain.type.ProductType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface UnitRepository extends PagingAndSortingRepository<Unit, Long> {
    List<Unit> findByName(@Param("name") String name);
}
