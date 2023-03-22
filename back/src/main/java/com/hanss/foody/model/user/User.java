package com.hanss.foody.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name", nullable = false, unique=true)
    private String name;
    @Column(name="email", nullable = false, unique=true)
    private String email;
    @Column(nullable = false, length = 60)
    @JsonIgnore
    private String password;
    private boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Set<Role> roles;

    private Integer height;
    private Integer weight;
}
