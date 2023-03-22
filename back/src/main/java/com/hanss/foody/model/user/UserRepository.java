package com.hanss.foody.model.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface UserRepository extends JpaRepository<User, Long> {

    public User getUserByName(@Param("name") String name);
    public User getUserByEmail(@Param("email") String name);

}
