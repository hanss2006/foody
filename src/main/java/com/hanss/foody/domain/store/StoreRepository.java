package com.hanss.foody.domain.store;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface StoreRepository extends PagingAndSortingRepository<Store, Long> {
}

