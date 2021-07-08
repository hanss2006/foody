package com.hanss.foody.domain.user;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    public User getUserByName(@Param("name") String name);
    public User getUserByEmail(@Param("email") String name);

}
