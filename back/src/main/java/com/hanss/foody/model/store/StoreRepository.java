package com.hanss.foody.model.store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface StoreRepository extends JpaRepository<Store, Long> {
    @Query("select s from Store s left join s.meal as m where m.name = ?1")
    List<Store> findByName(String name);

    @Query("select s from Store s left join s.meal as m where UPPER(m.name) like UPPER(CONCAT('%', ?1, '%'))")
    List<Store> findByNameContainingIgnoreCase(String name);

}

