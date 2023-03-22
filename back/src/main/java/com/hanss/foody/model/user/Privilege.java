package com.hanss.foody.model.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.*;
import java.util.Collection;

//@Entity
//@Data
//@RequiredArgsConstructor
public class Privilege {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    @ManyToMany(mappedBy = "privileges")
//    private Collection<Role> roles;
}
