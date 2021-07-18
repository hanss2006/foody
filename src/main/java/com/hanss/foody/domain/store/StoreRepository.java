package com.hanss.foody.domain.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface StoreRepository extends JpaRepository<Store, Long> {
}

